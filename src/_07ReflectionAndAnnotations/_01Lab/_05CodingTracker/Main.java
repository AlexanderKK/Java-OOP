package _07ReflectionAndAnnotations._01Lab._05CodingTracker;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.IntStream;

public class Main {

    @Author(name = "George")
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Tracker.printMethodsByAuthor(Main.class);
        Tracker.printMethodsByAuthor(Tracker.class);
    }

    @Author(name = "Alex")
    private static void printAllTo10() {
        IntStream.range(1, 11).forEach(e -> System.out.print(e + " "));
    }

    @Author(name = "Alex")
    private static String getText() {
        return "The End?";
    }


}
