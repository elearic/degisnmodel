package pattern.proxy.demo;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: Proxy.java, v 0.1 2020/5/10 11:42 PM zz_huns Exp $$
 *
 */
public class Proxy implements ISubject{

    private ISubject subject;


    public Proxy(ISubject iSubject){
        this.subject = iSubject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    public void before(){
        System.out.println("called before request()");
    }

    public void after(){
        System.out.println("called after requeste()");
    }

}
