package pattern.chain.demo;


/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: RoleCheckHandler.java, v 0.1 2020/4/6 1:37 PM zz_huns Exp $$
 *
 */
public class RoleCheckHandler extends Handler {
    @Override
    public void doRequest(Login login) {
        if (login.getRoleName().equals("admin")){
            System.out.println("角色校验通过");
            if (null != super.next) {
                super.next.doRequest(login);
                return;
            }
        }
        System.out.println("角色校验失败");
    }
}
