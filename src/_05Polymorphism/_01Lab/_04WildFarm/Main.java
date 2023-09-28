package _05Polymorphism._01Lab._04WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();
        Animal animal = null;
        int lineCounter = 0;

        String command;
        while(!(command = scanner.nextLine()).equals("End")) {
            String[] animalData = command.split("\\s+");

            if(lineCounter % 2 == 0) {
                String type = animalData[0];
                String name = animalData[1];
                Double weight = Double.parseDouble(animalData[2]);
                String livingRegion = animalData[3];

                if (type.equals("Cat")) {
                    String breed = animalData[4];
                    animal = new Cat(type, name, weight, livingRegion, breed);
                } else if (type.equals("Tiger")) {
                    animal = new Tiger(type, name, weight, livingRegion);
                } else if (type.equals("Zebra")) {
                    animal = new Zebra(type, name, weight, livingRegion);
                } else if (type.equals("Mouse")) {
                    animal = new Mouse(type, name, weight, livingRegion);
                }

                animals.add(animal);
            } else {
                String foodType = animalData[0];
                int foodQty = Integer.parseInt(animalData[1]);

                Food food = null;
                if(foodType.equals("Vegetable")) {
                    food = new Vegetable(foodQty);
                } else if(foodType.equals("Meat")) {
                    food = new Meat(foodQty);
                }

                Objects.requireNonNull(animal).makeSound();

                try {
                    animal.eat(food);
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            lineCounter++;
        }

        animals.forEach(System.out::println);
    }
}
