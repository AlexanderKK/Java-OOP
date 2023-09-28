package _07ReflectionAndAnnotations._01Lab._00Demo;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static int nonstatic = 0;

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, IOException, ClassNotFoundException, InvocationTargetException, InstantiationException {


        File root = new File("src");
        File[] files = root.listFiles();

//        BFS algorithm

//        ArrayDeque<File> queue = new ArrayDeque<>();
//        queue.offer(root);
//
//        List<String> classNames = new ArrayList<>();

//        while(!queue.isEmpty()) {
//            File file = queue.poll();
//
//            if(file.isDirectory()) {
//                File[] files = file.listFiles();
//
//                if (files != null) {
//                    for (File f : files) {
//                        if(f.isDirectory()) {
//                            queue.offer(f);
//                        } else {
//                            classNames.add(f.getName().split("\\.")[0]);
//                        }
//                    }
//                }
//            }
//        }

//        System.out.println();

        List<Class<?>> classes = Arrays.stream(files)
                .filter(File::isFile)
                .map(File::toString)
                .map(e -> {
                    String fileName = e.substring(e.lastIndexOf('\\') + 1, e.indexOf('.'));

                    try {
                        return Class.forName(fileName);
                    } catch (ClassNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(Collectors.toList());

        Class<?> reflectionClass = classes.get(1);
        Field[] declaredFields = classes.get(1).getDeclaredFields();
        Arrays.stream(declaredFields).forEach(e -> System.out.println(e.getType() + " " + e.getName() + " " + e.getAnnotatedType()));
        Reflection reflection = (Reflection) reflectionClass.getConstructor().newInstance();
        System.out.println(reflection.getName());

        Class<_07ReflectionAndAnnotations._01Lab._00Demo.Main> clazz = _07ReflectionAndAnnotations._01Lab._00Demo.Main.class;
        Class<?>[] interfaces = clazz.getInterfaces();
        Class<? super _07ReflectionAndAnnotations._01Lab._00Demo.Main> superclass = clazz.getSuperclass();

        System.out.println(Arrays.stream(interfaces).map(String::valueOf).collect(Collectors.joining(" ")));
        System.out.println(superclass);

        Constructor<?> ctor = clazz.getDeclaredConstructor(String.class);
//        Constructor<?>[] ctors = clazz.getDeclaredConstructors();

        Field[] fields = clazz.getDeclaredFields();
        Field field = fields[0];
        System.out.println(field.get(null));
        field.set(null, 7);
        System.out.println(field.get(null));

    }

}
