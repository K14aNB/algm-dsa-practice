package com.dsa.strings;

import java.util.HashMap;
import java.util.Map;

import com.dsa.utils.Utility;

public class Anagrams {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> freqS = new HashMap<>();
        Map<Character, Integer> freqT = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqS.put(c, freqS.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            freqT.put(c, freqT.getOrDefault(c, 0) + 1);
        }

        return freqS.equals(freqT);

    }

    public static void main(String[] args) {
        System.out.print("Enter String: ");
        String s = Utility.getStringFromUserInput();
        System.out.print("Enter String: ");
        String t = Utility.getStringFromUserInput();
        System.out.println("Checking if " + s + " and " + t + " are Anagrams: " + isAnagram(s, t));
    }

}
