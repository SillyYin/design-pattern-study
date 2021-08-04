package structural.plyweight;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/4
 */
public class Manager implements Employee{
    private String title = "部门经理";
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
