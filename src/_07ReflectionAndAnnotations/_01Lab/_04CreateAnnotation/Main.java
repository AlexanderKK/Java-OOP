package _07ReflectionAndAnnotations._01Lab._04CreateAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Reflection> clazz = Reflection.class;

        Set<Field> fields = Arrays.stream(clazz.getDeclaredFields())
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Field::getName))));

        fields.forEach(e -> {
            int modifier = e.getModifiers();

            if(!Modifier.isPrivate(modifier)) {
                System.out.println(e.getName() + " must be private!");
            }
        });

        Comparator<Method> comparator = Comparator.comparing(Method::getName);
        Set<Method> getters = new TreeSet<>(comparator);
        Set<Method> setters = new TreeSet<>(comparator);

        Method[] declaredMethods = clazz.getDeclaredMethods();

        Arrays.stream(declaredMethods)
                .forEach(e -> {
                    if(e.getName().startsWith("get")) {
                        getters.add(e);
                    } else if(e.getName().startsWith("set")) {
                        setters.add(e);
                    }
                });

        getters.forEach(e -> {
            int modifier = e.getModifiers();

            if(!Modifier.isPublic(modifier)) {
                System.out.println(e.getName() + " have to be public!");
            }
        });

        setters.forEach(e -> {
            int modifier = e.getModifiers();

            if(!Modifier.isPrivate(modifier)) {
                System.out.println(e.getName() + " have to be private!");
            }
        });
    }

}
