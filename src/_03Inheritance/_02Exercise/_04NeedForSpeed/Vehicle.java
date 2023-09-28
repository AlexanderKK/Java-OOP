package _03Inheritance._02Exercise._04NeedForSpeed;

public class Vehicle {
    //DEFAULT_FUEL_CONSUMPTION – final static double (constant)
    //• fuelConsumption – double
    //• fuel – double
    //• horsePower – int
    //• Getters and Setters for the fields
    //• A public constructor which accepts (fuel, horsePower) and set the default fuel consumption on the field fuelConsumption
    //• void drive(double kilometers)

    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        setFuel(fuel);
        setHorsePower(horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    private void setFuel(double fuel) {
        this.fuel = fuel;
    }

    private void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void drive(double kilometers) {
        fuel -= fuelConsumption * kilometers;
    }
}
