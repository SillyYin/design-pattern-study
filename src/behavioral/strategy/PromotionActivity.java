package behavioral.strategy;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/17
 */
public class PromotionActivity {
    private IPromotionStrategy promotionStrategy;

    public PromotionActivity(IPromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy() {
        promotionStrategy.doPromotion();
    }
}
