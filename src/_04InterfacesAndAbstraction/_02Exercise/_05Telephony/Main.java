package _04InterfacesAndAbstraction._02Exercise._05Telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phoneNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> URLs = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Smartphone smartPhone = new Smartphone(phoneNumbers, URLs);

        System.out.println(smartPhone.call());
        System.out.println(smartPhone.browse());
    }
}
