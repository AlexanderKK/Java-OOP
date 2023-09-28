package _03Inheritance._02Exercise._03PlayersAndMonsters;

public class Main {
    public static void main(String[] args) {
        BladeKnight bladeKnight = new BladeKnight("blade", 10);
        System.out.println(bladeKnight.getUsername());
        System.out.println(bladeKnight.getLevel());

        System.out.println(bladeKnight);
    }
}
