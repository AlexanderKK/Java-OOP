package _04InterfacesAndAbstraction._02Exercise._07CollectionHierarchy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        //Add elements to all collections
        String[] elements = scanner.nextLine().split("\\s+");

        performAddOperations(elements, addCollection);
        performAddOperations(elements, addRemoveCollection);
        performAddOperations(elements, myList);

        //Remove elements removeCount times
        int removeCount = Integer.parseInt(scanner.nextLine());

        performRemoveOperations(removeCount, addRemoveCollection);
        performRemoveOperations(removeCount, myList);
    }

    private static void performAddOperations(String[] elements, Addable addable) {
        for (String element : elements) {
            System.out.print(addable.add(element) + " ");
        }
        System.out.println();
    }

    private static void performRemoveOperations(int removeCounter, AddRemovable addRemovable) {
        for (int i = 0; i < removeCounter; i++) {
            System.out.print(addRemovable.remove() + " ");
        }
        System.out.println();
    }
}
