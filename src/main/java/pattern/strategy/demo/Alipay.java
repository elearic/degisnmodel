package pattern.strategy.demo;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: Alipay.java, v 0.1 2020/4/6 8:54 PM zz_huns Exp $$
 *
 */
public class Alipay extends Payment {

    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 10D;
    }
}
