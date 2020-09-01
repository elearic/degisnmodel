package pattern.factory.abstractfactory;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: WxPay.java, v 0.1 2020/4/5 7:08 PM zz_huns Exp $$
 *
 */
public class WxPay implements IPay {


    /**
     * 付款
     */
    @Override
    public void pay() {
        System.out.println("使用微信付款了");
    }
}
