package pattern.strategy;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: AppMain.java, v 0.1 2020/4/6 4:02 PM zz_huns Exp $$
 *
 */
public class AppMain {

    public static void main(String[] args) {
//        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
//        PromotionActivity activity11 = new PromotionActivity(new CashbackStrategy());
//
//        activity618.execute();
//
//        activity11.execute();


        PromotionStrategyFactory.getPromotionKeys();
        String promotionKey = "COUPON";

        IPromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();
    }
}
