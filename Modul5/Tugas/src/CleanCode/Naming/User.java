package CleanCode.Naming;

public class User {
    protected String username;
    protected String password;

    public void saveCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
