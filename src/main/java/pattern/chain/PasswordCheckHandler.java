package pattern.chain;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: PasswordCheckHandler.java, v 0.1 2020/4/6 1:37 PM zz_huns Exp $$
 *
 */
public class PasswordCheckHandler extends Handler {
    @Override
    public void doRequest(Login login) {
        if (login.getLoginPassword().equals("abc")){
            System.out.println("密码校验通过");
            if (null != super.next){
                super.next.doRequest(login);
                return;
            }
        }
        System.out.println("密码校验失败");
    }
}
