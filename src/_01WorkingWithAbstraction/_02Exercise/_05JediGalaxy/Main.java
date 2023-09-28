package _01WorkingWithAbstraction._02Exercise._05JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readPositions(scanner);
        int rows = dimensions[0];
        int cols = dimensions[1];

        Field field = new Field(rows, cols);

        long starsCollected = 0;
        String command;
        while(!"Let the Force be with you".equals(command = scanner.nextLine())) {
            Jedi jedi = new Jedi(Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray());
            EvilPower evilPower = new EvilPower(readPositions(scanner));

            Galaxy galaxy = new Galaxy(field, jedi, evilPower);
            galaxy.moveEvil();

            starsCollected += galaxy.moveJedi();
        }

        System.out.println(starsCollected);
    }

    private static int[] readPositions(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
