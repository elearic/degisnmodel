package pattern.chain;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: TokenCheckHandler.java, v 0.1 2020/4/6 1:37 PM zz_huns Exp $$
 *
 */
public class TokenCheckHandler extends Handler {

    @Override
    public void doRequest(Login login) {
        if (login.getLoginToken().equals("666")){
            System.out.println("token校验成功");
            if (null != super.next){
                super.next.doRequest(login);
            }
            return;
        }
        System.out.println("token 校验失败");
    }
}
