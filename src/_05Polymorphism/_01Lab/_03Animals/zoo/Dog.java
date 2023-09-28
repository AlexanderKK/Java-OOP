package _05Polymorphism._01Lab._03Animals.zoo;

public class Dog extends Animal {

    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("%s%sDJAAF", super.explainSelf(), System.lineSeparator());
    }

}
