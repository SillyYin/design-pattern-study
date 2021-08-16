package structural.proxy;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/16
 */
public class OrderServiceImpl implements IOrderService{
    private IOrderDao iOrderDao;
    @Override
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
