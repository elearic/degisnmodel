package pattern.proxy.demo;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: AppMain.java, v 0.1 2020/5/10 11:58 PM zz_huns Exp $$
 *
 */
public class AppMain {


    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
