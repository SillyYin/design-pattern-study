package structural.facade;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/3
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("aaa");
        GiftExchangeService exchangeService = new GiftExchangeService();

        exchangeService.giftExchange(pointsGift);
    }
}
