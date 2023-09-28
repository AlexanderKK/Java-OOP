package _01WorkingWithAbstraction._02Exercise._03CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cardRankName = scanner.nextLine().toUpperCase();
        String cardSuitName = scanner.nextLine().toUpperCase();

        CardSuit cardSuit = CardSuit.valueOf(cardSuitName);
        CardRank cardRank = CardRank.valueOf(cardRankName);

        Card card = new Card(cardSuit, cardRank);
        System.out.println(card);
    }
}
