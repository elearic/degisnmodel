package pattern.chain.demo;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: Login.java, v 0.1 2020/4/6 1:35 PM zz_huns Exp $$
 *
 */
public class Login {

    private String loginToken;

    private String loginPassword;

    private String roleName;

    public Login(String loginToken, String loginPassword, String roleName) {
        this.loginToken = loginToken;
        this.loginPassword = loginPassword;
        this.roleName = roleName;
    }

    public String getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }





}
