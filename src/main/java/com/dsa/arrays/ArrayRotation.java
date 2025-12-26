package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.dsa.utils.Utility;

public class ArrayRotation {

    public static List<Integer> rotateArray(List<Integer> nums, int k) {
        List<Integer> rotatedArray = new ArrayList<>();
        if (k == 0) {
            rotatedArray = nums;
        } else if (k < nums.size()) {
            rotatedArray = Stream.concat(nums.subList(k + 1, nums.size()).stream(), nums.subList(0, k + 1).stream())
                    .toList();
        } else if (k == nums.size()) {
            rotatedArray = nums.reversed();
        } else if (k > nums.size()) {
            rotatedArray = Stream
                    .concat(nums.subList(k % nums.size() + 1, nums.size()).stream(),
                            nums.subList(0, k % nums.size() + 1).stream())
                    .toList();
        }
        return rotatedArray;

    }

    public static void main(String[] args) {
        System.out.print("Enter Array Elements separated by whitespace: ");
        List<Integer> nums = Utility.getUnModifiableListOfIntegersFromUserInput();
        System.out.print("Enter pivot location by which Array elements are to be rotated: ");
        int k = Utility.getIntegerFromUserInput();
        List<Integer> rotatedArray = rotateArray(nums, k);
        System.out.println("Rotated Array on pivot location " + k + ": " + rotatedArray);
    }

}
