package _06SOLID._01Lab.p04_InterfaceSegregation;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        accountManager.register("alex", "big");

        AccountController controller = new AccountController(accountManager);
        controller.changePassword("big", "BIG DADDY D");

        System.out.println(accountManager.getUsername());
        System.out.println(accountManager.getPassword());
    }
}
