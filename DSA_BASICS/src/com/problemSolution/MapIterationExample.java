package com.problemSolution;

import java.util.HashMap;
import java.util.Map;

public class MapIterationExample {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<String, Integer>  map = new HashMap<>();

        map.put("Apple", 250);
        map.put("Banana", 70);
        map.put("Orange", 100);
        map.put("Grapes", 200);

        System.out.println("Iterating using keySet():");

        // Method 1 : using keySet()

        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("\nIterating using entrySet():");

        // Method 2: Using entrySet() (more efficient)

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

/*

Key Differences:

1. keySet() approach:

    -First gets all keys

    -Then looks up each value using map.get(key)

    -Requires two operations per entry (get key, then get value)


2. entrySet() approach:

    -Gets both key and value together in one operation

    -More efficient (single lookup per entry)

    -Preferred method for most cases

 */


/*

 When to Use Which:

    Use entrySet() when you need both keys and values (more efficient)

    Use keySet() when you only need to work with the keys

    Use values() if you only need the values (map.values())

 */