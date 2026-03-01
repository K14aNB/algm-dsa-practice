package com.dsa.strings;

import com.dsa.utils.Utility;

public class StringCompare {

    public static int compareStrings(String s1, String s2) {
        int result = -2;

        if (s1.length() > s2.length() && s1.contains(s2)) {
            result = 1;
        } else if (s2.length() > s1.length() && s2.contains(s1)) {
            result = -1;
        } else if (s1.length() == s2.length() && s1.equals(s2)) {
            result = 0;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (i > s2.length()) {
                    result = 1;
                    break;
                } else if (Character.valueOf(s1.charAt(i)) < Character.valueOf(s2.charAt(i))) {
                    result = -1;
                    break;
                } else if (Character.valueOf(s1.charAt(i)) > Character.valueOf(s2.charAt(i))) {
                    result = 1;
                    break;
                }
            }

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.print("Enter String 1: ");
        String s1 = Utility.getStringFromUserInput();
        System.out.print("Enter String 2: ");
        String s2 = Utility.getStringFromUserInput();
        System.out.println("String Comparison of " + s1 + " and " + s2 + ": " + compareStrings(s1, s2));
    }

}
