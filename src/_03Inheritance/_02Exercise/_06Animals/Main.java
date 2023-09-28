package _03Inheritance._02Exercise._06Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        String command;
        while(!"Beast!".equals(command = scanner.nextLine())) {
            String animalType = command;
            String[] animalData = scanner.nextLine().split("\\s+");

            String name = animalData[0];
            int age = Integer.parseInt(animalData[1]);
            String gender = animalData[2];

            Animal animal;

            try {
                switch(animalType) {
                    case "Cat":
                        animal = new Cat(name, age, gender);
                        break;
                    case "Dog":
                        animal = new Dog(name, age, gender);
                        break;
                    case "Frog":
                        animal = new Frog(name, age, gender);
                        break;
                    case "Kitten":
                        animal = new Kitten(name, age);
                        break;
                    case "Tomcat":
                        animal = new Tomcat(name, age);
                        break;
                    default:
                        animal = null;
                }

                animals.add(animal);
            } catch(IllegalStateException ex) {
                System.out.println(ex.getMessage());
            }
        }

        animals.forEach(System.out::println);
    }
}
