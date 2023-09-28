package _05Polymorphism._01Lab._01MathOperation;

public class MathOperation {
    private MathOperation() {
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return add(add(a, b), c);
    }

    public static int add(int a, int b, int c, int d) {
        return add(add(a, b, c), d);
    }
}
