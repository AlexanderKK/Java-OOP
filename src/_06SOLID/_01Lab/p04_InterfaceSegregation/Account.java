package _06SOLID._01Lab.p04_InterfaceSegregation;

public interface Account {

    void register(String username, String password);

    void login(String username, String password);

    Iterable<User> getAllUsersOnline();

}
