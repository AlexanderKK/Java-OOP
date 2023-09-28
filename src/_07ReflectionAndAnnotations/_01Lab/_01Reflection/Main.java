package _07ReflectionAndAnnotations._01Lab._01Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //Instantiate object of type Class
        //This will be my input using the source code as data

        //Get class type
        Class<Reflection> clazz = Reflection.class;
        System.out.println(clazz);

        //Get superclass type
        Class<? super Reflection> superclass = clazz.getSuperclass();
        System.out.println(superclass);

        //All interfaces of this class
        Class<?>[] interfaces = clazz.getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);

        //Instantiate object
//        Constructor<?> constructor = clazz.getDeclaredConstructor();
//        Reflection reflection = (Reflection) constructor.newInstance();
//
//        System.out.println(reflection);

        Constructor<Reflection> constructor = clazz.getDeclaredConstructor();
        Reflection reflection = constructor.newInstance();

        System.out.println(reflection);

    }

}
