package pattern.proxy.demo;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: RealSubject.java, v 0.1 2020/5/10 11:42 PM zz_huns Exp $$
 *
 */
public class RealSubject implements ISubject {

    @Override
    public void request() {
        System.out.println("real service is called");
    }
}
