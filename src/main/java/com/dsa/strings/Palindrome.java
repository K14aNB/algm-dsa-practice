package com.dsa.strings;

import com.dsa.utils.Utility;

public class Palindrome {

    public static boolean isPalindromeUsingStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeAdvanced(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else {
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter a single word: ");
        String s = Utility.getStringFromUserInput().split(" ")[0];
        System.out.print("Enter a string: ");
        String s1 = Utility.getStringFromUserInput();
        System.out.println("Checking if " + s + " is a Palindrome: " + isPalindromeUsingStringBuilder(s));
        System.out.println("Checking if " + s + " is a Palindrome: " + isPalindrome(s));
        System.out.println("Checking if " + s1 + " is a Palindrome: " + isPalindromeAdvanced(s1));
    }

}
