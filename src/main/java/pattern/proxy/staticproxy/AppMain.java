package pattern.proxy.staticproxy;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: AppMain.java, v 0.1 2020/5/11 12:04 AM zz_huns Exp $$
 *
 */
public class AppMain {

    public static void main(String[] args) {
        ZhangLaoSan zhangLaoSan = new ZhangLaoSan(new ZhangSan());
        zhangLaoSan.findLove();
    }
}
