package _05Polymorphism._02Exercises._02VehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Vehicle> vehiclesMap = new LinkedHashMap<>();

        //Add car
        String[] carData = scanner.nextLine().split("\\s+");
        Vehicle car = getVehicle(carData);
        vehiclesMap.put("Car", car);

        //Add truck
        String[] truckData = scanner.nextLine().split("\\s+");
        Vehicle truck = getVehicle(truckData);
        vehiclesMap.put("Truck", truck);

        //Add bus
        String[] busData = scanner.nextLine().split("\\s+");
        Vehicle bus = getVehicle(busData);
        vehiclesMap.put("Bus", bus);

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] commandParts = scanner.nextLine().split("\\s+");

            String cmdType = commandParts[0];
            String vehicleType = commandParts[1];
            double distanceOrFuel = Double.parseDouble(commandParts[2]);

            try {
                if (cmdType.equals("Drive")) {   //Drive vehicle

                    vehiclesMap.get(vehicleType).isEmpty(false);

                    vehiclesMap.get(vehicleType).drive(distanceOrFuel);

                } else if (cmdType.equals("DriveEmpty")) {   //Refuel vehicle

                    vehiclesMap.get(vehicleType).isEmpty(true);

                    vehiclesMap.get(vehicleType).drive(distanceOrFuel);

                } else if (cmdType.equals("Refuel")) {

                    vehiclesMap.get(vehicleType).refuel(distanceOrFuel);

                }
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        vehiclesMap.values().forEach(Vehicle::printFuel);
    }

    private static Vehicle getVehicle(String[] data) {
        String vehicleType = data[0];
        double fuelQty = Double.parseDouble(data[1]);
        double litersPerKm = Double.parseDouble(data[2]);
        double tankCapacity = Double.parseDouble(data[3]);

        Vehicle vehicle = null;

        try {

            if (vehicleType.equals("Car")) {
                vehicle = new Car(fuelQty, litersPerKm, tankCapacity);
            } else if (vehicleType.equals("Truck")) {
                vehicle = new Truck(fuelQty, litersPerKm, tankCapacity);
            } else if (vehicleType.equals("Bus")) {
                vehicle = new Bus(fuelQty, litersPerKm, tankCapacity);
            }
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }

        return vehicle;
    }
}
