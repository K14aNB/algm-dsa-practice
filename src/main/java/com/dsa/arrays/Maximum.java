package com.dsa.arrays;

import java.util.List;

import com.dsa.utils.Utility;

public class Maximum {

    public static int findMaximumOnUnsortedArray(List<Integer> nums) {
        int max = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.print("Enter Array Elements separated by whitespace: ");
        List<Integer> arr = Utility.getUnModifiableListOfIntegersFromUserInput();
        int maxValue = findMaximumOnUnsortedArray(arr);
        System.out.println("Maximum Value: " + maxValue);

    }

}
