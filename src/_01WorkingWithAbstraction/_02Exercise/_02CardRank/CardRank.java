package _01WorkingWithAbstraction._02Exercise._02CardRank;

import java.util.Arrays;

public enum CardRank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s", ordinal(), name());
    }

    public static void printCardRanks() {
        System.out.println("Card Ranks:");
        Arrays.stream(values()).forEach(System.out::println);
    }
}
