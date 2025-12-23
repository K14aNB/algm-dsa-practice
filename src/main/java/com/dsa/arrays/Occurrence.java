package com.dsa.arrays;

import java.util.List;
import java.util.Scanner;

public class Occurrence {

    public static int countOccurrence(List<Integer> nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count;

    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : List.of(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array Elements separated by whitespace: ");
        List<Integer> nums = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).toList();
        System.out.print("Enter Target value: ");
        int target = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int occurrence = countOccurrence(nums, target);
        System.out.println("Number of Occurrences of " + target + ": " + occurrence);
    }

}
