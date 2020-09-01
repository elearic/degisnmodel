package pattern.factory.abstractfactory;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: WxPayFactory.java, v 0.1 2020/4/5 7:10 PM zz_huns Exp $$
 *
 */
public class WxPayFactory implements PayFactory {

    @Override
    public IPay createPay() {
        return new WxPay();
    }
}
