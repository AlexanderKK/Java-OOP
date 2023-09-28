package _05Polymorphism._02Exercises._01Vehicles;

public class Truck extends Vehicle {

    private static final double AIR_CONDITION_CONSUMPTION = 1.6;

    protected Truck(double fuelQty, double fuelConsumption) {
        super(fuelQty, fuelConsumption + AIR_CONDITION_CONSUMPTION);
    }

}
