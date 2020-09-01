package pattern.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: PromotionStrategyFactory.java, v 0.1 2020/4/6 8:27 PM zz_huns Exp $$
 *
 */
public class PromotionStrategyFactory {

    private static Map<String,IPromotionStrategy> PROMOTIONS = new HashMap<>();

    static {
        PROMOTIONS.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTIONS.put(PromotionKey.CASHBACK,new CashbackStrategy());
        PROMOTIONS.put(PromotionKey.GROUPBUY,new GroupbuyStrategy());
    }

    private static final IPromotionStrategy EMPTY = new EmptyStrategy();

    public static IPromotionStrategy getPromotionStrategy(String promotionKey){
        IPromotionStrategy strategy = PROMOTIONS.get(promotionKey);
        return strategy == null ? EMPTY:strategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK  = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }

    public static Set<String> getPromotionKeys(){
        return PROMOTIONS.keySet();
    }

}
