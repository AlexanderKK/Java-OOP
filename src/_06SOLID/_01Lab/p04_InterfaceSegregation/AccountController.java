package _06SOLID._01Lab.p04_InterfaceSegregation;

public class AccountController implements AccountControllerInterface {
    private final AccountManager manager;

    private boolean requireUniqueEmail;

    private int minRequiredPasswordLength;

    private int maxRequiredPasswordLength;

    @Override
    public boolean getRequireUniqueEmail() {
        return this.requireUniqueEmail;
    }

    @Override
    public int getMinRequiredPasswordLength() {
        return this.minRequiredPasswordLength;
    }

    @Override
    public int getMaxRequiredPasswordLength() {
        return this.maxRequiredPasswordLength;
    }

    public AccountController(AccountManager manager) {
        this.manager = manager;
    }

    @Override
    public void changePassword(String oldPass, String newPass) {
        if(oldPass.equals(manager.getPassword())) {
            manager.setPassword(newPass);
        }
    }

}
