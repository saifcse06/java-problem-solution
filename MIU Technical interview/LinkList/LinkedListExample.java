package LinkList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Elements in the linked list: " + linkedList);

        // Adding an element at the beginning of the linked list
        linkedList.addFirst("Grape");
        System.out.println("Elements in the linked list: " + linkedList);

        // Adding an element at the end of the linked list
        linkedList.addLast("Peach");
        System.out.println("Elements in the linked list: " + linkedList);

        // Removing an element from the linked list
        String removedElement = linkedList.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Elements in the linked list: " + linkedList);

        // Checking the element at the beginning of the linked list
        String firstElement = linkedList.getFirst();
        System.out.println("First element: " + firstElement);

        // Checking the element at the end of the linked list
        String lastElement = linkedList.getLast();
        System.out.println("Last element: " + lastElement);
    }
}
