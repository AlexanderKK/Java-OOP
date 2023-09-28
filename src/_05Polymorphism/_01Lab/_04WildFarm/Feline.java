package _05Polymorphism._01Lab._04WildFarm;

public abstract class Feline extends Mammal {

    protected Feline(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(getFoodEaten() + food.getQuantity());
    }
}
