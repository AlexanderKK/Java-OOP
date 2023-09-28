package _05Polymorphism._02Exercises._01Vehicles;

public class Car extends Vehicle {

    private static final double AIR_CONDITION_CONSUMPTION = 0.9;

    public Car(double fuelQty, double fuelConsumption) {
        super(fuelQty, fuelConsumption + AIR_CONDITION_CONSUMPTION);
    }

}
