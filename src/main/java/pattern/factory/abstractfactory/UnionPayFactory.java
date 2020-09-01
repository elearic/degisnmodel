package pattern.factory.abstractfactory;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: UnionPayFactory.java, v 0.1 2020/4/5 7:33 PM zz_huns Exp $$
 *
 */
public class UnionPayFactory implements PayFactory {
    @Override
    public IPay createPay() {
        return new UnionPay();
    }
}
