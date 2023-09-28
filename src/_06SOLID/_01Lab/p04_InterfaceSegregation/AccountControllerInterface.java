package _06SOLID._01Lab.p04_InterfaceSegregation;

public interface AccountControllerInterface {

    boolean getRequireUniqueEmail();

    int getMinRequiredPasswordLength();

    int getMaxRequiredPasswordLength();

    void changePassword(String oldPass, String newPass);

}
