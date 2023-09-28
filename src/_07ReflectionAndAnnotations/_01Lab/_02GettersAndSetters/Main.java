package _07ReflectionAndAnnotations._01Lab._02GettersAndSetters;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Reflection> clazz = Reflection.class;

        Comparator<Method> methodComparator = Comparator.comparing(Method::getName);
        Set<Method> getters = new TreeSet<>(methodComparator);
        Set<Method> setters = new TreeSet<>(methodComparator);

        Method[] declaredMethods = clazz.getDeclaredMethods();
        Arrays.stream(declaredMethods)
                .forEach(e -> {
                    if(e.getName().startsWith("get")) {
                        getters.add(e);
                    } else if(e.getName().startsWith("set")) {
                        setters.add(e);
                    }
                });

        getters.forEach(e -> System.out.printf("%s will return class %s%s", e.getName(), e.getReturnType().getName(), System.lineSeparator()));
        setters.forEach(e -> System.out.printf("%s and will set field of class %s%s", e.getName(), e.getParameterTypes()[0].getName(), System.lineSeparator()));
    }

}
