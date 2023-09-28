package _05Polymorphism._01Lab._04WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {

    private String livingRegion;

    protected Mammal(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight);
        setLivingRegion(livingRegion);
    }

    private void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void eat(Food food) {
        String animalType = getClass().getSimpleName().equals("Mouse") ? "Mice" : "Zebras";

        if (food instanceof Meat) {
            throw new IllegalStateException(animalType + " are not eating that type of food!");
        }

        setFoodEaten(getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %d]",
                getAnimalType(),
                getAnimalName(),
                df.format(getAnimalWeight()),
                livingRegion,
                getFoodEaten());
    }

}
