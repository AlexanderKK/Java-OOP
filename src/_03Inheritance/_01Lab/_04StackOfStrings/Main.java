package _03Inheritance._01Lab._04StackOfStrings;

public class Main {
    public static void main(String[] args) {
        StackOfStrings sos = new StackOfStrings();
        sos.push("one");
        sos.push("two");
        sos.push("three");

        System.out.println(sos.isEmpty());
        System.out.println(sos.peek());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());

        try {
            System.out.println(sos.pop());
        } catch(Exception e) {
            System.out.println("Cannot remove from empty stack");
        }
    }
}
