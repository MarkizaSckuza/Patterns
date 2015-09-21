package proxy;

/**
 * Created by Margo on 21.09.2015.
 */
public class User {

    private String login;
    private String password;
    private Boolean isAdmin;

    public User(String login, String password, Boolean isAdmin) {
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }
}
