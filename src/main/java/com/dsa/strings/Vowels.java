package com.dsa.strings;

import java.util.Set;

import com.dsa.utils.Utility;

public class Vowels {

    private static final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public static String removeVowels(String s) {
        if (s == null)
            return null;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!vowels.contains(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.print("Enter String: ");
        String s = Utility.getStringFromUserInput();
        System.out.println("Modified String after removing vowels from " + s + ": " + removeVowels(s));
    }

}
