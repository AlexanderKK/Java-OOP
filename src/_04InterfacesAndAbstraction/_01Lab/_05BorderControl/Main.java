package _04InterfacesAndAbstraction._01Lab._05BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> identifiables = new ArrayList<>();
        String command;
        while(!"End".equals(command = scanner.nextLine())) {
            String[] data = command.split("\\s+");

            Identifiable identifiable;
            if(data.length == 3) {
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String id = data[2];

                identifiable = new Citizen(name, age, id);
            } else {
                String model = data[0];
                String id = data[1];

                identifiable = new Robot(model, id);
            }

            identifiables.add(identifiable);
        }

        String fakeIdPostFix = scanner.nextLine();

        identifiables.stream()
                .map(Identifiable::getId)
                .filter(e -> e.endsWith(fakeIdPostFix))
                .forEach(System.out::println);
    }
}
