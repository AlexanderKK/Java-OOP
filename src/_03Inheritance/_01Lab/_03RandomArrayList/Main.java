package _03Inheritance._01Lab._03RandomArrayList;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> list = new RandomArrayList<>();

        IntStream.range(1, 10).forEach(list::add);

        System.out.println(list.getRandomElement());

        list.forEach(e -> System.out.print(e + " "));
    }
}
