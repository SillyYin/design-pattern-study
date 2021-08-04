package structural.plyweight;

import com.oracle.tools.packager.mac.MacAppBundler;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/4
 */
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理: " + department);
            String reportContent = department + "部门的汇报内容......";
            manager.setReportContent(reportContent);
            System.out.println("报告内容: " + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
