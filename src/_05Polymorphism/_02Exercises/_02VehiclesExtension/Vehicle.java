package _05Polymorphism._02Exercises._02VehiclesExtension;

import java.text.DecimalFormat;

import static _05Polymorphism._02Exercises._02VehiclesExtension.FuelModifier.BUS_WITH_PASSENGERS_CONSUMPTION;
import static _05Polymorphism._02Exercises._02VehiclesExtension.FuelModifier.TRUCK_FUEL_REDUCTION;

public abstract class Vehicle implements Drivable, Refuelable {

    private double litersFuel;
    private double litersPerKm;
    private double tankCapacity;

    protected Vehicle(double fuelQty, double fuelConsumption, double tankCapacity) {
        setTankCapacity(tankCapacity);
        setFuelConsumption(fuelConsumption);
        setFuel(fuelQty);
    }

    private void setFuel(double fuelQty) {
        ensureFuel(fuelQty);

        this.litersFuel = fuelQty;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.litersPerKm = fuelConsumption;
    }

    private void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    protected void isEmpty(boolean empty) {
        if(!empty) {
            setFuelConsumption(litersPerKm + BUS_WITH_PASSENGERS_CONSUMPTION.getModifier());
        }
    }

    @Override
    public void drive(double distance) {
        DecimalFormat df = new DecimalFormat("#.##");

        double fuelConsumed = distance * litersPerKm;

        if(fuelConsumed > litersFuel) {
            throw new IllegalStateException(String.format("%s needs refueling", getClass().getSimpleName()));
        }

        setFuel(litersFuel - fuelConsumed);

        System.out.printf("%s travelled %s km%s", getClass().getSimpleName(), df.format(distance), System.lineSeparator());
    }

    @Override
    public void refuel(double fuelAdded) {
        ensureFuel(fuelAdded);

        if(this.getClass() == Truck.class) {
            fuelAdded *= TRUCK_FUEL_REDUCTION.getModifier();
        }

        double fuel = litersFuel + fuelAdded;
        if(fuel > tankCapacity) {
            throw new IllegalStateException("Cannot fit fuel in tank");
        }

        setFuel(fuel);
    }

    private static void ensureFuel(double fuel) {
        if(fuel <= 0) {
            throw new IllegalStateException("Fuel must be a positive number");
        }
    }

    public void printFuel() {
        System.out.printf("%s: %.2f%s", getClass().getSimpleName(), litersFuel, System.lineSeparator());
    }

}
