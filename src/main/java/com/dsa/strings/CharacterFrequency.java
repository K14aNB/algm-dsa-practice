package com.dsa.strings;

import java.util.HashMap;
import java.util.Map;

import com.dsa.utils.Utility;

public class CharacterFrequency {

    public static Map<String, Integer> countCharacters(String s) {
        Map<String, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            String key = String.valueOf(c);
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        System.out.print("Enter String: ");
        String s = Utility.getStringFromUserInput();
        System.out.println("Character Frequency Map of " + s + ":" + countCharacters(s));
    }

}
