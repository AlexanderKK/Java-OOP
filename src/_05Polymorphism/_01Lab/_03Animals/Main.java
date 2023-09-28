package _05Polymorphism._01Lab._03Animals;

import _05Polymorphism._01Lab._03Animals.zoo.Animal;
import _05Polymorphism._01Lab._03Animals.zoo.Cat;
import _05Polymorphism._01Lab._03Animals.zoo.Dog;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Oscar", "Whiskas");
        Animal dog = new Dog("Rocky", "Meat");

        System.out.println(cat.explainSelf());
        System.out.println(dog.explainSelf());
    }
}
