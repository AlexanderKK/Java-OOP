package _02Encapsulation._02Exercise._01ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private static void ensureBoxSide(double sideSize, String prefix) {
        if(sideSize <= 0) {
            throw new IllegalStateException(prefix + " cannot be zero or negative.");
        }
    }

    private void setLength(double length) {
        ensureBoxSide(length, "Length");

        this.length = length;
    }

    private void setWidth(double width) {
        ensureBoxSide(width, "Width");

        this.width = width;
    }

    private void setHeight(double height) {
        ensureBoxSide(height, "Height");

        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double calculateLateralSurfaceArea() {
        return 2 * height * (length + width);
    }

    public double calculateVolume() {
        return length * width * height;
    }
}
