package com.problemSolution;

import java.util.HashMap;

public class CharacterCounter {
    public static void main(String[] args) {
        String str = "munna aziz : R";

        HashMap<Character, Integer> freq = new HashMap<>();

        // Count each character's frequency
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // print the result
        System.out.println(freq);
    }
}


/*

Explanation:
1. Initialize a HashMap to store characters (Character) and their counts (Integer).

2. Iterate over each character in the string using s.toCharArray().

3. Update the count using freq.getOrDefault(c, 0) + 1:

    If the character c is already in the map, increment its count.

    If not, default to 0 and then add 1.

4. Print the result, which shows each character and its frequency.
 */