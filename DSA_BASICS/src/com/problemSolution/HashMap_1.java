package com.problemSolution;

import java.util.HashMap;

public class HashMap_1 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 200);
        map.put("apple", 250);   // What happens here both keys are same

        System.out.println(map.get("apple"));
        /*
        The value for key "apple" updates to 75.
        HashMaps don't allow duplicate keys – the second put overwrites the first.
         */
    }
}
