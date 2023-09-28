package _04InterfacesAndAbstraction._02Exercise._03BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> thingsWithBirthDate = new ArrayList<>();

        String command;
        while(!"End".equals(command = scanner.nextLine())) {
            String[] commandParts = command.split("\\s+");
            String objectType = commandParts[0];

            switch (objectType) {
                case "Citizen":
                    String citizenName = commandParts[1];
                    int age = Integer.parseInt(commandParts[2]);
                    String citizenId = commandParts[3];
                    String citizenBirthDate = commandParts[4];

                    Citizen citizen = new Citizen(citizenName, age, citizenId, citizenBirthDate);
                    thingsWithBirthDate.add(citizen);
                    break;
                case "Pet":
                    String petName = commandParts[1];
                    String petBirthDate = commandParts[2];

                    Pet pet = new Pet(petName, petBirthDate);
                    thingsWithBirthDate.add(pet);
                    break;
                case "Robot":
                    break;
            }
        }

        String yearSuffix = scanner.nextLine();

        boolean isYearFound = false;
        for (Birthable birthable : thingsWithBirthDate) {
            if(birthable.getBirthDate().endsWith(yearSuffix)) {
                System.out.println(birthable.getBirthDate());
                isYearFound = true;
            }
        }

        if(!isYearFound) {
            System.out.println("<no output>");
        }
    }
}
