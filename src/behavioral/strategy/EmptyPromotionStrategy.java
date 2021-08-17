package behavioral.strategy;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/17
 */
public class EmptyPromotionStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销");
    }
}
