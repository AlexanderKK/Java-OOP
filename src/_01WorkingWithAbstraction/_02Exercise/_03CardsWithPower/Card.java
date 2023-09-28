package _01WorkingWithAbstraction._02Exercise._03CardsWithPower;

public class Card {
    private CardSuit suit;
    private CardRank rank;

    public Card(CardSuit suit, CardRank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", rank.name(), suit.name(), rank.getPower() + suit.getPower());
    }
}
