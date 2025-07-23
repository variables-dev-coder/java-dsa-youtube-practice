package com.problemSolution;

import java.util.HashMap;
import java.util.Map;

public class MapIterationDemo {
    public static void main(String[] args) {

        // Create and populate a HashMap

        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("Apple", 250);
        fruitPrices.put("Banana", 70);
        fruitPrices.put("Orange", 100);
        fruitPrices.put("Mango", 80);

        System.out.println("====== Using keySet =====");

        // Method 1: Iterate using keySet()

        for (String fruit : fruitPrices.keySet()) {
            System.out.println(fruit + " costs ₹" + fruitPrices.get(fruit));
        }

        System.out.println("\n====== Using EntrySet()=======");

        // Method 2: Iterate using entrySet() (more efficient)

        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + " cost ₹" + entry.getValue());
        }
    }
}
