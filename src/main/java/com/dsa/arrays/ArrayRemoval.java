package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

import com.dsa.utils.Utility;

public class ArrayRemoval {

    public static List<Integer> removeElement(List<Integer> nums, int target) {
        List<Integer> modifiedArray = new ArrayList<>();
        for (int num : nums) {
            if (num != target) {
                modifiedArray.add(num);
            }
        }

        return modifiedArray;
    }

    public static void main(String[] args) {
        System.out.print("Enter Array Elements separated by whitespace: ");
        List<Integer> nums = Utility.getModifiableListOfIntegersFromUserInput();
        System.out.print("Enter Target value to be removed from Array: ");
        int target = Utility.getIntegerFromUserInput();
        List<Integer> modifiedArray = removeElement(nums, target);
        System.out.println("Modified Array after removal of " + target + ": " + modifiedArray);

    }

}
