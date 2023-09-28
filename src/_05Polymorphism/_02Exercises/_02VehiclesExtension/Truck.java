package _05Polymorphism._02Exercises._02VehiclesExtension;

import static _05Polymorphism._02Exercises._02VehiclesExtension.FuelModifier.TRUCK_AIR_CONDITION_CONSUMPTION;

public class Truck extends Vehicle {

    public Truck(double fuelQty, double fuelConsumption, double tankCapacity) {
        super(fuelQty, fuelConsumption + TRUCK_AIR_CONDITION_CONSUMPTION.getModifier(), tankCapacity);
    }

}
