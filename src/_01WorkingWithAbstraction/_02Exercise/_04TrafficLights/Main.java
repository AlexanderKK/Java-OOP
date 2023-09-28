package _01WorkingWithAbstraction._02Exercise._04TrafficLights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lights = scanner.nextLine().split("\\s+");
        int timesToChangeLight = Integer.parseInt(scanner.nextLine());

        TrafficLight.changeLights(lights, timesToChangeLight);
    }
}
