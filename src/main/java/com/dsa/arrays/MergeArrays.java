package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.dsa.utils.Utility;

public class MergeArrays {

    public static List<Integer> mergeSortedArraysUsingStreams(List<Integer> nums1, List<Integer> nums2) {
        return Stream.concat(nums1.stream(), nums2.stream()).sorted().toList();
    }

    public static List<Integer> mergeSortedArrays(List<Integer> nums1, List<Integer> nums2) {
        int ptr1 = 0, ptr2 = 0;
        List<Integer> mergedArray = new ArrayList<>();

        while (ptr1 < nums1.size() && ptr2 < nums2.size()) {
            if (nums1.get(ptr1) < nums2.get(ptr2)) {
                mergedArray.add(nums1.get(ptr1));
                ptr1++;
            } else if (nums1.get(ptr1) == nums2.get(ptr2)) {
                mergedArray.add(nums1.get(ptr1));
                ptr1++;
                ptr2++;
            } else {
                mergedArray.add(nums2.get(ptr2));
                ptr2++;
            }
        }

        while (ptr1 < nums1.size()) {
            mergedArray.add(nums1.get(ptr1));
            ptr1++;
        }

        while (ptr2 < nums2.size()) {
            mergedArray.add(nums2.get(ptr2));
            ptr2++;
        }

        return mergedArray;

    }

    public static void main(String[] args) {
        System.out.print("Enter Array Elements separated by whitespace: ");
        List<Integer> nums1 = Utility.getUnModifiableListOfIntegersFromUserInput();
        System.out.print("Enter Array Elements separated by whitespace: ");
        List<Integer> nums2 = Utility.getUnModifiableListOfIntegersFromUserInput();
        List<Integer> mergedArrayUsingStreams = mergeSortedArraysUsingStreams(nums1, nums2);
        List<Integer> mergedArray = mergeSortedArrays(nums1, nums2);
        System.out.println("Merged Array of " + nums1 + " and " + nums2 + " using streams: " + mergedArrayUsingStreams);
        System.out.println("Merged Array of " + nums1 + " and " + nums2 + " using streams: " + mergedArray);
    }

}
