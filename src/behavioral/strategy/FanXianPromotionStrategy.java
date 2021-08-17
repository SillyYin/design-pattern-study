package behavioral.strategy;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/17
 */
public class FanXianPromotionStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销");
    }
}
