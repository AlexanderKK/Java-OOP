package _05Polymorphism._02Exercises._01Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle implements Drivable, Refuelable {

    private double litersFuel;
    private double litersPerKm;

    protected Vehicle(double fuelQty, double fuelConsumption) {
        setFuel(fuelQty);
        setFuelConsumption(fuelConsumption);
    }

    private void setFuel(double fuelQty) {
        this.litersFuel = fuelQty;
    }

    public double getFuel() {
        return litersFuel;
    }

    private void setFuelConsumption(double fuelConsumption) {
        this.litersPerKm = fuelConsumption;
    }

    @Override
    public void drive(double distance) {
        DecimalFormat df = new DecimalFormat("#.##");

        double fuelConsumed = distance * litersPerKm;

        if(fuelConsumed > litersFuel) {
            throw new IllegalStateException(String.format("%s needs refueling", getClass().getSimpleName()));
        }

        setFuel(getFuel() - fuelConsumed);

        System.out.printf("%s travelled %s km%s", getClass().getSimpleName(), df.format(distance), System.lineSeparator());
    }

    @Override
    public void refuel(double fuel) {
        if(this.getClass() == Truck.class) {
            fuel *= .95;
        }

        setFuel(getFuel() + fuel);
    }

    public void printFuel() {
        System.out.printf("%s: %.2f%s", getClass().getSimpleName(), litersFuel, System.lineSeparator());
    }

}
