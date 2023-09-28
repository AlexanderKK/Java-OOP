package _01WorkingWithAbstraction._01Lab._01RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //Top of rhombus
        printTopPart(n);

        //Middle of rhombus
        printMiddlePart(n);

        //Bottom of rhombus
        printBottomPart(n);
    }

    private static void printTopPart(int n) {
        for (int row = 1; row <= n - 1; row++) {
            printRow(n, row);
        }
    }

    private static void printBottomPart(int n) {
        for (int row = n - 1; row >= 1; row--) {
            printRow(n, row);
        }
    }

    private static void printMiddlePart(int n) {
        printStars(n);
    }

    private static void printRow(int n, int row) {
        printSpaces(n, row);

        printStars(row);
    }

    private static void printStars(int n) {
        for (int star = 1; star <= n; star++) {
            System.out.print("* ");
        }
        System.out.println();
    }


    private static void printSpaces(int n, int row) {
        for (int space = 1; space <= n - row; space++) {
            System.out.print(" ");
        }
    }
}
