package _05Polymorphism._02Exercises._02VehiclesExtension;

public enum FuelModifier {

    CAR_AIR_CONDITION_CONSUMPTION(0.9),
    TRUCK_AIR_CONDITION_CONSUMPTION(1.6),
    TRUCK_FUEL_REDUCTION(0.95),
    BUS_WITH_PASSENGERS_CONSUMPTION(1.4);

    private final double modifier;

    FuelModifier(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }

}
