package pattern.strategy.demo;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: WechatPay.java, v 0.1 2020/4/6 8:55 PM zz_huns Exp $$
 *
 */
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 20D;
    }
}
