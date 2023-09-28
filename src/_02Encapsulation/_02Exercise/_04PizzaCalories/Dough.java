package _02Encapsulation._02Exercise._04PizzaCalories;

import java.util.Arrays;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        boolean isFlourTypePresent = Arrays.stream(FlourType.values()).anyMatch(e -> e.name().equals(flourType.toUpperCase()));
        if (!isFlourTypePresent) {
            throw new IllegalStateException("Invalid type of dough.");
        }

        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        boolean isTechniquePresent = Arrays.stream(BakingTechnique.values()).anyMatch(e -> e.name().equals(bakingTechnique.toUpperCase()));
        if (!isTechniquePresent) {
            throw new IllegalStateException("Invalid type of dough.");
        }

        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 200) {
            throw new IllegalStateException("Dough weight should be in the range [1..200].");
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        FlourType flour = FlourType.valueOf(flourType.toUpperCase());
        BakingTechnique technique = BakingTechnique.valueOf(bakingTechnique.toUpperCase());

        return 2.00 * weight * flour.getModifier() * technique.getModifier();
    }
}
