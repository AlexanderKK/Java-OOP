package _07ReflectionAndAnnotations._02Exercise._02BlackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<BlackBoxInt> clazz = BlackBoxInt.class;

        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();

        Scanner scanner = new Scanner(System.in);

        Field field = clazz.getDeclaredField("innerValue");
        field.setAccessible(true);

        String command;
        while(!"END".equals(command = scanner.nextLine())) {
            String[] commandParts = command.split("_");
            String methodName = commandParts[0];
            int value = Integer.parseInt(commandParts[1]);

            Method method = clazz.getDeclaredMethod(methodName, int.class);
            method.setAccessible(true);
            method.invoke(blackBoxInt, value);

            System.out.println(field.get(blackBoxInt));
        }
    }

}
