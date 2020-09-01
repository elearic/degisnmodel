package pattern.strategy;

/**
 * 策略的具体实现，返现策略
 *
 *  * @author zz_huns  
 *  @version Id: CashbackStrategy.java, v 0.1 2020/4/6 3:49 PM zz_huns Exp $$
 *
 */
public class CashbackStrategy  implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现，直接打款到支付宝账户");
    }
}
