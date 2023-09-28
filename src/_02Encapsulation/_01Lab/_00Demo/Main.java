package _02Encapsulation._01Lab._00Demo;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> a = (List<String>) Collections.unmodifiableCollection(new ArrayList<>(Arrays.asList("a", "b")));
    }
}
