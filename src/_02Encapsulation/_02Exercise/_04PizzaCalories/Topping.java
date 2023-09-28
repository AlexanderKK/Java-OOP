package _02Encapsulation._02Exercise._04PizzaCalories;

import java.util.Arrays;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        boolean isToppingPresent = Arrays.stream(ToppingType.values()).anyMatch(e -> e.name().equals(toppingType.toUpperCase()));
        if (!isToppingPresent) {
            throw new IllegalStateException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }

        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 50) {
            throw new IllegalStateException(String.format("%s weight should be in the range [1..50].", toppingType));
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        ToppingType topping = ToppingType.valueOf(toppingType.toUpperCase());
        return 2.00 * weight * topping.getModifier();
    }
}
