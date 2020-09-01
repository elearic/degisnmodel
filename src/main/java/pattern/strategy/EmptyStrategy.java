package pattern.strategy;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: EmptyStrategy.java, v 0.1 2020/4/6 3:52 PM zz_huns Exp $$
 *
 */
public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
