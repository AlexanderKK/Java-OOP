package _04InterfacesAndAbstraction._02Exercise._02MultipleImplementation;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Class[] citizenInterfaces = Citizen.class.getInterfaces();
        if (Arrays.asList(citizenInterfaces).contains(Birthable.class)
                && Arrays.asList(citizenInterfaces).contains(Identifiable.class)) {

            Method[] methodsBirthable = Birthable.class.getDeclaredMethods();
            Method[] methodsIdentifiable = Identifiable.class.getDeclaredMethods();

            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthDate = scanner.nextLine();

            Identifiable identifiable = new Citizen(name, age, id, birthDate);
            Birthable birthable = new Citizen(name, age, id, birthDate);
            Person person = new Citizen(name, age, id, birthDate);
//            Citizen citizen = new Citizen(name, age, id, birthDate);

            System.out.println(methodsBirthable.length);
            System.out.println(methodsIdentifiable[0].getReturnType().getSimpleName());
            System.out.println(methodsIdentifiable.length);
            System.out.println(methodsIdentifiable[0].getReturnType().getSimpleName());

            System.out.println(identifiable.getId());
            System.out.println(birthable.getBirthDate());
            System.out.println(person.getName());
            System.out.println(Arrays.stream(Citizen.class.getDeclaredMethods())
                    .map(Method::getName)
                    .collect(Collectors.joining(", ")));
        }
    }
}
