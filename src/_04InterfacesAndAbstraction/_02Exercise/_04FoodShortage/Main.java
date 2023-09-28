package _04InterfacesAndAbstraction._02Exercise._04FoodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfPeople; i++) {
            String[] personData = scanner.nextLine().split("\\s+");
            String name = personData[0];
            int age = Integer.parseInt(personData[1]);

            if(personData.length == 3) {
                String group = personData[2];

                Person rebel = new Rebel(name, age, group);
                people.add(rebel);
            } else {
                String id = personData[2];
                String birthDate = personData[3];

                Person citizen = new Citizen(name, age, id, birthDate);
                people.add(citizen);
            }
        }

        String command;
        while(!"End".equals(command = scanner.nextLine())) {
            String name = command;

            people.stream()
                    .filter(e -> e.getName().equals(name))
                    .findAny()
                    .ifPresent(Person::buyFood);
        }

        int totalFood = people.stream()
                .mapToInt(Person::getFood)
                .sum();

        System.out.println(totalFood);
    }
}
