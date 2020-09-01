package pattern.factory.abstractfactory;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: PaypalPayFactory.java, v 0.1 2020/4/5 7:32 PM zz_huns Exp $$
 *
 */
public class PaypalPayFactory implements PayFactory {

    @Override
    public IPay createPay() {
        return new PayPalPay();
    }
}
