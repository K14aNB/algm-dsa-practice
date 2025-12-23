package com.dsa.arrays;

import java.util.List;
import java.util.Scanner;

public class Maximum {

    public static int findMaximum(List<Integer> nums) {
        int max = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : List.of(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array Elements separated by whitespace: ");
        List<Integer> arr = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).toList();
        scanner.close();
        int maxValue = findMaximum(arr);
        System.out.println("Maximum Value: " + maxValue);

    }

}
