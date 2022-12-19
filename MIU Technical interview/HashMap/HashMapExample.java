package HashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with string keys and integer values
        HashMap<String, Integer> map = new HashMap<>();

        // Add some elements to the map
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Retrieve an element from the map
        int value = map.get("Apple");
        System.out.println(value); // prints 10

        // Remove an element from the map
        map.remove("Banana");

        // Check if the map contains a key
        boolean containsKey = map.containsKey("Apple");
        System.out.println(containsKey); // prints true
    }
}
