package _05Polymorphism._02Exercises._01Vehicles;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicle> vehiclesMap = new LinkedHashMap<>();

        //Add car
        String[] carData = scanner.nextLine().split("\\s+");
        double fuelQty = Double.parseDouble(carData[1]);
        double litersPerKm = Double.parseDouble(carData[2]);

        Vehicle car = new Car(fuelQty, litersPerKm);
        vehiclesMap.put("Car", car);

        //Add truck
        String[] truckData = scanner.nextLine().split("\\s+");
        fuelQty = Double.parseDouble(truckData[1]);
        litersPerKm = Double.parseDouble(truckData[2]);

        Vehicle truck = new Truck(fuelQty, litersPerKm);
        vehiclesMap.put("Truck", truck);

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] commandParts = scanner.nextLine().split("\\s+");

            String cmdType = commandParts[0];
            String vehicleType = commandParts[1];
            double distanceOrFuel = Double.parseDouble(commandParts[2]);

            try {
                if(cmdType.equals("Drive")) {   //Drive vehicle
                    vehiclesMap.get(vehicleType).drive(distanceOrFuel);
                } else {   //Refuel vehicle
                    vehiclesMap.get(vehicleType).refuel(distanceOrFuel);
                }
            } catch(IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        vehiclesMap.values().forEach(Vehicle::printFuel);
    }
}
