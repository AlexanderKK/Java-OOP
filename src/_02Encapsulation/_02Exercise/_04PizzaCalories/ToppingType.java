package _02Encapsulation._02Exercise._04PizzaCalories;

public enum ToppingType {
    MEAT(1.2),
    VEGGIES(0.8),
    CHEESE(1.1),
    SAUCE(0.9);

    ToppingType(double modifier) {
        this.modifier = modifier;
    }

    private double modifier;

    public double getModifier() {
        return modifier;
    }
}
