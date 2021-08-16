package structural.proxy.dynamicproxy;

import structural.proxy.IOrderService;
import structural.proxy.Order;
import structural.proxy.OrderServiceImpl;
import structural.proxy.staticproxy.OrderServiceStaticProxy;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/16
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderService.saveOrder(order);
    }
}
