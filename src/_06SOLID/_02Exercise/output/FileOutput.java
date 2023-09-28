package _06SOLID._02Exercise.output;

import _06SOLID._02Exercise.calculator.Calculator;
import _06SOLID._02Exercise.interfaces.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileOutput implements Output {

    private static final String SUM = "Sum calories: %.2f";
    private static final String AVERAGE = "Average calories: %.2f";
    private final Calculator calculator;
    private FileWriter fw;

    public FileOutput(Calculator calculator, String filename) throws IOException {
        this.fw = new FileWriter(filename);
        this.calculator = calculator;
    }

    @Override
    public void outputSum(List<Product> products) {
        try {
            fw.append(String.format((SUM) + "%n", calculator.total(products)));
        } catch(Exception ignored) {
            System.out.println("File does not exist");
        }
    }

    @Override
    public void outputAverage(List<Product> products) {
        try {
            fw.append(String.format((AVERAGE) + "%n", calculator.average(products)));
            fw.close();
        } catch(Exception ignored) {
            System.out.println("File does not exist");
        }
    }

}
