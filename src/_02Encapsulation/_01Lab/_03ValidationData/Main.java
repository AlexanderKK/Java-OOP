package _02Encapsulation._01Lab._03ValidationData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> people = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");

            Optional<Person> person = Optional.empty();

            try {
                Person newPerson = new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));

                person = Optional.of(newPerson);
            } catch(IllegalStateException e) {
                System.out.println(e.getMessage());
            }

            person.ifPresent(people::add);
        }

        double bonus = Double.parseDouble(reader.readLine());

        for (Person person : people) {
            person.increaseSalary(bonus);

            System.out.println(person);
        }
    }
}
