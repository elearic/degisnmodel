package pattern.chain.demo;


/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: Handler.java, v 0.1 2020/4/6 2:14 PM zz_huns Exp $$
 *
 */
public abstract class Handler<T> {

    protected Handler next;

    public void next(Handler handler){
        this.next = handler;
    }

    public abstract void doRequest(Login login);


    public static class Builder<T>{
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler<T> handler){
            if (this.head == null){
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public Handler<T> build() {
            return this.head;
        }
    }
}
