package pattern.factory.abstractfactory;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: PayPalPay.java, v 0.1 2020/4/5 7:09 PM zz_huns Exp $$
 *
 */
public class PayPalPay implements IPay {
    /**
     * 付款
     */
    @Override
    public void pay() {
        System.out.println("使用paypal付款了");
    }
}
