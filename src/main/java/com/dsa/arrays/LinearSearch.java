package com.dsa.arrays;

import java.util.List;

import com.dsa.utils.Utility;

public class LinearSearch {

	/**
	 * @description Performs Linear Search through a list of integers and returns
	 *              the index of the first occurrence of the target value.
	 * 
	 * 
	 * @param arr
	 * @param target
	 * @return The index of the target if present in arr else -1
	 * @complexity Time Complexity: O(n); Space Complexity: O(1)
	 */
	public static int performLinearSearch(List<Integer> arr, int target) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == target) {
				return i;
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		System.out.print("Enter Array Elements separated by whitespace: ");
		List<Integer> arr = Utility.getUnModifiableListOfIntegersFromUserInput();
		System.out.print("Enter Target value: ");
		int target = Utility.getIntegerFromUserInput();
		int res = performLinearSearch(arr, target);
		System.out.println(res);

	}

}
