package _05Polymorphism._02Exercises._02VehiclesExtension;

import static _05Polymorphism._02Exercises._02VehiclesExtension.FuelModifier.CAR_AIR_CONDITION_CONSUMPTION;

public class Car extends Vehicle {

    public Car(double fuelQty, double fuelConsumption, double tankCapacity) {
        super(fuelQty, fuelConsumption + CAR_AIR_CONDITION_CONSUMPTION.getModifier(), tankCapacity);
    }

}
