package pattern.chain.demo;


/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: AppMain.java, v 0.1 2020/4/6 1:38 PM zz_huns Exp $$
 *
 */
public class AppMain {

    public static void main(String[] args) {

        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new TokenCheckHandler())
                .addHandler(new PasswordCheckHandler())
                .addHandler(new RoleCheckHandler());

        builder.build().doRequest(new Login("666","abc","admin"));

    }
}
