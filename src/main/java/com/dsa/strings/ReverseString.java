package com.dsa.strings;

import com.dsa.utils.Utility;

public class ReverseString {

    public static String reverseStringUsingStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseStringUsingArray(String s) {
        char[] charArray = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        System.out.print("Enter String: ");
        String s = Utility.getStringFromUserInput();
        System.out.println("Reverse of " + s + " is :" + reverseStringUsingArray(s));
        System.out.println("Reverse of " + s + " is: " + reverseStringUsingStringBuilder(s));
    }

}
