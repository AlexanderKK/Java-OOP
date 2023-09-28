package _07ReflectionAndAnnotations._01Lab._05CodingTracker;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Tracker {

    @Author(name = "Peter")
    public static void printMethodsByAuthor(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();

        Comparator<String> comparator = Comparator.naturalOrder();
        Map<String, List<Method>> methodsMap = new TreeMap<>(comparator);

        for (Method method : methods) {
            if(method.isAnnotationPresent(Author.class)) {
                Author annotation = method.getAnnotation(Author.class);

                String author = annotation.name();

                methodsMap.putIfAbsent(author, new ArrayList<>());
                methodsMap.get(author).add(method);
            }
        }

        methodsMap.forEach((k, v) -> {
            System.out.printf("%s: %s%n", k, v.stream()
                    .sorted(Comparator.comparing(Method::getName))
                    .map(e -> e.getName() + "()").collect(Collectors.joining(", ")));
        });
    }

}
