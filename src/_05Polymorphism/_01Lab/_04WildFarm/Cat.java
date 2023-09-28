package _05Polymorphism._01Lab._04WildFarm;

import java.text.DecimalFormat;

public class Cat extends Feline {

    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        setBreed(breed);
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %s, %d]",
                getAnimalType(),
                getAnimalName(),
                breed,
                df.format(getAnimalWeight()),
                getLivingRegion(),
                getFoodEaten());
    }

}
