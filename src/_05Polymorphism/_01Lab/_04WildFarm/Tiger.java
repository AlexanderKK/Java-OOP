package _05Polymorphism._01Lab._04WildFarm;

public class Tiger extends Feline {

    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Vegetable) {
            throw new IllegalStateException("Tigers are not eating that type of food!");
        }

        setFoodEaten(getFoodEaten() + food.getQuantity());
    }
}
