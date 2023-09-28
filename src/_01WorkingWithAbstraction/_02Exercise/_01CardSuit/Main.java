package _01WorkingWithAbstraction._02Exercise._01CardSuit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        CardSuit.printCardSuits();

        System.out.println("Card Suits:");
        Arrays.stream(CardSuit.values()).forEach(e -> System.out.printf("Ordinal value: %d; Name value: %s%n", e.ordinal(), e.name()));

//        System.out.println("Card Suits:");
//        for (CardSuit cardSuit : CardSuit.values()) {
//            System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(), cardSuit.name());
//        }
    }
}
