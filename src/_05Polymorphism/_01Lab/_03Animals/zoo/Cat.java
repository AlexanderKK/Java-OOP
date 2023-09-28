package _05Polymorphism._01Lab._03Animals.zoo;

public class Cat extends Animal {

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("%s%sMEEOW", super.explainSelf(), System.lineSeparator());
    }

}
