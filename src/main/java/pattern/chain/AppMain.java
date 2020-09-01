package pattern.chain;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: AppMain.java, v 0.1 2020/4/6 1:38 PM zz_huns Exp $$
 *
 */
public class AppMain {

    public static void main(String[] args) {

        Handler tokenCheckHandler = new TokenCheckHandler();

        Handler passwordCheckHandler = new PasswordCheckHandler();

        Handler roleCheckHandler = new RoleCheckHandler();


        tokenCheckHandler.setNextHandler(passwordCheckHandler).setNextHandler(roleCheckHandler);

        Login login = new Login("666","abc","admin");

        tokenCheckHandler.doRequest(login);

    }
}
