package LinkList;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Adding elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Elements in the list: " + list);

        // Adding an element at a specific index
        list.add(1, "Grape");
        System.out.println("Elements in the list: " + list);

        // Removing an element from the list
        String removedElement = list.remove(2);
        System.out.println("Removed element: " + removedElement);
        System.out.println("Elements in the list: " + list);

        // Checking the size of the list
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // Checking if the list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
    }
}
