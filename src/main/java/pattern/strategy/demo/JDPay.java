package pattern.strategy.demo;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: JDPay.java, v 0.1 2020/4/6 8:55 PM zz_huns Exp $$
 *
 */
public class JDPay extends Payment {

    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500D;
    }
}
