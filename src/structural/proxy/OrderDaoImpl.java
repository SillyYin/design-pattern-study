package structural.proxy;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/16
 */
public class OrderDaoImpl implements IOrderDao{
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
