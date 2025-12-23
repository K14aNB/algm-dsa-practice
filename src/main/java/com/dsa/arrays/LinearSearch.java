package com.dsa.arrays;

import java.util.List;
import java.util.Scanner;

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

	public static List<String> splitWords(String s) {
		return s.isEmpty() ? List.of() : List.of(s.split(" "));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Array Elements separated by whitespace: ");
		List<Integer> arr = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).toList();
		System.out.print("Enter Target value: ");
		int target = Integer.parseInt(scanner.nextLine());
		scanner.close();
		int res = performLinearSearch(arr, target);
		System.out.println(res);

	}

}
