package com.problemSolution;

import java.util.HashMap;

public class HashMap_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("banana", 70);
        map.put("pears", 150);

        System.out.println(map.get("apple"));  // null

        // Because "banana" doesn't exist in the map.
        // Always check containsKey() before get() to avoid NullPointerException.
    }
}
