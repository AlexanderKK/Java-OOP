package _02Encapsulation._02Exercise._03ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] people = scanner.nextLine().split(";");
        Map<String, Person> peopleMap = new LinkedHashMap<>();

        for (String personString : people) {
            String[] personData = personString.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);

            try {
                Person person = new Person(name, money);
                peopleMap.put(name, person);
            } catch(IllegalStateException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String[] products = scanner.nextLine().split(";");
        Map<String, Product> productsMap = new LinkedHashMap<>();

        for (String productString : products) {
            String[] productData = productString.split("=");
            String name = productData[0];
            double cost = Double.parseDouble(productData[1]);

            try {
                Product product = new Product(name, cost);
                productsMap.put(name, product);
            } catch(IllegalStateException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String command;
        while(!"END".equals(command = scanner.nextLine())) {
            String personName = command.split("\\s+")[0];
            String productName = command.split("\\s+")[1];

            Person currentPerson = peopleMap.get(personName);
            Product currentProduct = productsMap.get(productName);

            try {
                currentPerson.buyProduct(currentProduct);
                System.out.printf("%s bought %s%n", personName, productName);
            } catch(IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        peopleMap.values().forEach(System.out::println);
    }
}
