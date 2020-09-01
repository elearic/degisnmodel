package pattern.strategy.demo;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: MsgResult.java, v 0.1 2020/4/6 8:50 PM zz_huns Exp $$
 *
 */
public class MsgResult {

    private int code;

    private Object data;

    private String msg;

    public MsgResult(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
