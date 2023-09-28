package _04InterfacesAndAbstraction._01Lab._04SayHelloExtended;

public class Chinese extends BasePerson {

    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }

}
