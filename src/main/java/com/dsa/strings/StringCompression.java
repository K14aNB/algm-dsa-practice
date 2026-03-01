package com.dsa.strings;

import com.dsa.utils.Utility;

public class StringCompression {

    public static String compressString(String s) {
        if (s == null)
            return null;
        else if (s.isEmpty())
            return "";

        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            char prevChar = s.charAt(i - 1);
            if (c == prevChar) {
                count++;
            } else {
                sb.append(prevChar);
                sb.append(count);
                count = 1;
            }
        }

        sb.append(s.charAt(s.length() - 1));
        sb.append(count);

        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.print("Enter String: ");
        String s = Utility.getStringFromUserInput();
        System.out.println("Compressed String of " + s + ": " + compressString(s));
    }

}
