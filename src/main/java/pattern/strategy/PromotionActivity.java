package pattern.strategy;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: PromotionActivity.java, v 0.1 2020/4/6 4:02 PM zz_huns Exp $$
 *
 */
public class PromotionActivity {

    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        strategy.doPromotion();
    }
}
