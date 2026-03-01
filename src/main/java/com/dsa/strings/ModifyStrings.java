package com.dsa.strings;

import com.dsa.utils.Utility;

public class ModifyStrings {

    public static String safeModifyStringUsingStringBuilder(String s, int index, String newChar) {
        String result = "";
        try {
            StringBuilder sb = new StringBuilder(s);
            sb.setCharAt(index, newChar.charAt(0));
            result = sb.toString();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            result = s;
        }

        return result;

    }

    public static String safeModifyStringUsingPlusOperator(String s, int index, String newChar) {
        String result = "";
        try {
            result = s.substring(0, index) + newChar.charAt(0) + s.substring(index + 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            result = s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Enter String: ");
        String s = Utility.getStringFromUserInput();
        System.out.print("Enter String: ");
        String s1 = Utility.getStringFromUserInput();
        System.out.print("Enter Index to modify: ");
        int index = Utility.getIntegerFromUserInput();
        System.out.print("Enter New Character as String: ");
        String newChar = Utility.getStringFromUserInput();
        System.out.println("Original String: " + s);
        System.out.println(
                "Modified String Using StringBuilder: " + safeModifyStringUsingStringBuilder(s, index, newChar));
        System.out.println("Original String: " + s1);
        System.out.println(
                "Modified String Using Plus Operator: " + safeModifyStringUsingPlusOperator(s1, index, newChar));

    }

}
