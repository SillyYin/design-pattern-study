package structural.facade;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/3
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        System.out.println("物流：" + pointsGift.getName());
        return "123124";
    }
}
