package pattern.factory.abstractfactory;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: AliPay.java, v 0.1 2020/4/5 7:08 PM zz_huns Exp $$
 *
 */
public class AliPay implements IPay {
    /**
     * 付款
     */
    @Override
    public void pay() {
        System.out.println("使用支付宝付款了");
    }
}
