package _05Polymorphism._01Lab._04WildFarm;

public abstract class Animal {

    private String animalType;
    private String animalName;
    private Double animalWeight;
    private Integer foodEaten;

    protected Animal(String animalType, String animalName, Double animalWeight) {
        setAnimalType(animalType);
        setAnimalName(animalName);
        setAnimalWeight(animalWeight);
        this.foodEaten = 0;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    private void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    private void setAnimalWeight(Double animalWeight) {
        this.animalWeight = animalWeight;
    }

    protected void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);
}
