package structural.proxy.staticproxy;

import structural.proxy.Order;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/16
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
