package _03Inheritance._01Lab._04StackOfStrings;

import java.util.Deque;
import java.util.ArrayDeque;

public class StackOfStrings {
    private Deque<String> data;

    public StackOfStrings() {
        this.data = new ArrayDeque<>();
    }

    public void push(String item) {
        data.push(item);
    }

    public String pop() {
        return data.pop();
    }

    public String peek() {
        return data.peek();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
