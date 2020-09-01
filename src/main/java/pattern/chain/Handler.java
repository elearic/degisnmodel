package pattern.chain;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: Handler.java, v 0.1 2020/4/6 1:33 PM zz_huns Exp $$
 *
 */
public abstract class Handler {


    protected Handler next = null;


    public Handler setNextHandler(Handler next){
        this.next = next;
        return next;
    }

    public abstract void doRequest(Login login);
}
