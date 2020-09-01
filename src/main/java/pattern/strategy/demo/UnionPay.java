package pattern.strategy.demo;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: UnionPay.java, v 0.1 2020/4/6 8:56 PM zz_huns Exp $$
 *
 */
public class UnionPay extends Payment{

    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 405D;
    }
}
