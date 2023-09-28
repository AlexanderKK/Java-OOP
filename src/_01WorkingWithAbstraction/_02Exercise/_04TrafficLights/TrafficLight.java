package _01WorkingWithAbstraction._02Exercise._04TrafficLights;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum TrafficLight {
    RED("RED"),
    GREEN("GREEN"),
    YELLOW("YELLOW");

    private String color;

    TrafficLight(String color) {
        this.color = color;
    }

    public static String[][] addLightsToMatrix(String[] lights, int timesToChangeLight) {
        String[][] matrix = new String[timesToChangeLight][lights.length];

        List<TrafficLight> listLights = Arrays.stream(values()).collect(Collectors.toList());
        for (int lightCol = 0; lightCol < lights.length; lightCol++) {
            TrafficLight trafficLight = TrafficLight.valueOf(lights[lightCol]);
            int index = listLights.indexOf(trafficLight) + 1;

            for (int lightRow = 0; lightRow < timesToChangeLight; lightRow++) {
                if(index >= listLights.size()) {
                    index = 0;
                }

                matrix[lightRow][lightCol] = listLights.get(index++).color;
            }
        }

        return matrix;
    }

    private static void printLights(String[][] matrix) {
        for (String[] row : matrix) {
            for (String colValue : row) {
                System.out.print(colValue + " ");
            }
            System.out.println();
        }
    }

    public static void changeLights(String[] lights, int timesToChangeLight) {
        String[][] matrix = addLightsToMatrix(lights, timesToChangeLight);

        printLights(matrix);
    }

    public String getColor() {
        return color;
    }
}
