package pattern.strategy.demo;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: AppMain.java, v 0.1 2020/4/6 9:27 PM zz_huns Exp $$
 *
 */
public class AppMain {

    public static void main(String[] args) {
        Order order = new Order("1","20201212010101",125D);
        MsgResult pay = order.pay(PayStrategy.WECHAT_PAY);
        System.out.println(pay.toString());
    }
}
