package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        System.out.println("Elements in the queue: " + queue);

        // Removing elements from the queue
        String removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Elements in the queue: " + queue);

        // Checking the element at the front of the queue
        String head = queue.peek();
        System.out.println("Head of the queue: " + head);

        // Checking if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}
