package pattern.strategy;

/**
 *  策略实现类，拼团
 *  
 *  * @author zz_huns  
 *  @version Id: GroupbuyStrategy.java, v 0.1 2020/4/6 3:50 PM zz_huns Exp $$
 *
 */
public class GroupbuyStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("5人成团，可以优惠");
    }
}
