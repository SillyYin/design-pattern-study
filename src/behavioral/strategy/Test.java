package behavioral.strategy;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/17
 */
public class Test {
    public static void main(String[] args) {
        PromotionActivity promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1 = new PromotionActivity(new FanXianPromotionStrategy());
        promotionActivity.executePromotionStrategy();
        promotionActivity1.executePromotionStrategy();
    }
}
