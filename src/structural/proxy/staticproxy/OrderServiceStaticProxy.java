package structural.proxy.staticproxy;

import structural.proxy.IOrderService;
import structural.proxy.Order;
import structural.proxy.OrderServiceImpl;
import structural.proxy.db.DataSourceContextHolder;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/16
 */
public class OrderServiceStaticProxy {
    // 目标方法
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod();
        iOrderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");
        afterMethod();
        return iOrderService.saveOrder(order);
    }

    private void beforeMethod() {
        System.out.println("static proxy before");
    }

    private void afterMethod() {
        System.out.println("static proxy after");
    }
}
