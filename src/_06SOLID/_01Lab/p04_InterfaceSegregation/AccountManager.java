package _06SOLID._01Lab.p04_InterfaceSegregation;

public class AccountManager implements Account {

    private String username;
    private String password;

    @Override
    public void register(String username, String password) {
        this.username = username;
        setPassword(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void login(String username, String password) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<User> getAllUsersOnline() {
        throw new UnsupportedOperationException();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
