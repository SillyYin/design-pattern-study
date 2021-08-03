package structural.facade;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/3
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        System.out.println("支付" + pointsGift.getName());
        return true;
    }
}
