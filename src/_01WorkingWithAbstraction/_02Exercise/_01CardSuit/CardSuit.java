package _01WorkingWithAbstraction._02Exercise._01CardSuit;

import java.util.Arrays;

public enum CardSuit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;

    public static void printCardSuits() {
        StringBuilder sb = new StringBuilder();
        sb.append("Card Suits:").append(System.lineSeparator());
        Arrays.stream(CardSuit.values()).forEach(e -> {
            sb.append(String.format("Ordinal value: %d; Name value: %s", e.ordinal(), e.name()));
            sb.append(System.lineSeparator());
        });

        System.out.println(sb);
    }
}
