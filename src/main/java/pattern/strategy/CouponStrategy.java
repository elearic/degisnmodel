package pattern.strategy;

/**
 *  策略的具体实现 优惠券策略
 *  
 *  * @author zz_huns  
 *  @version Id: CouponStrategy.java, v 0.1 2020/4/6 3:48 PM zz_huns Exp $$
 *
 */
public class CouponStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("使用优惠券抵扣");
    }
}
