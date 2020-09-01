package pattern.factory.abstractfactory;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: AliPayFactory.java, v 0.1 2020/4/5 7:32 PM zz_huns Exp $$
 *
 */
public class AliPayFactory implements PayFactory {

    /**
     * 付款
     */
    @Override
    public IPay createPay() {
        return new AliPay();
    }
}
