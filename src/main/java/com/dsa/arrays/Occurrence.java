package com.dsa.arrays;

import java.util.List;

import com.dsa.utils.Utility;

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

    public static void main(String[] args) {
        System.out.print("Enter Array Elements separated by whitespace: ");
        List<Integer> nums = Utility.getUnModifiableListOfIntegersFromUserInput();
        System.out.print("Enter Target value: ");
        int target = Utility.getIntegerFromUserInput();
        int occurrence = countOccurrence(nums, target);
        System.out.println("Number of Occurrences of " + target + ": " + occurrence);
    }

}
