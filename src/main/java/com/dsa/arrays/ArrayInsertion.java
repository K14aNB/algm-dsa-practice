package com.dsa.arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayInsertion {

    public static int appendAndCount(List<Integer> arr, List<Integer> values) {
        for (int num : values) {
            arr.add(num);
        }
        return arr.size();
    }

    public static List<Integer> insertAtPositionUsingAdd(List<Integer> arr, int index, int value) {
        arr.add(index, value);
        return arr;
    }

    public static List<Integer> insertAtPosition(List<Integer> arr, int index, int value) {
        arr.add(null);
        for (int i = arr.size() - 1; i >= index; i--) {
            arr.set(i, arr.get(i - 1));
        }
        arr.set(index, value);
        return arr;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : List.of(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array Elements separated by whitespace: ");
        List<Integer> arr = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.print("Enter Values to be inserted into Array separated by whitespace: ");
        List<Integer> values = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).toList();
        System.out.print("Enter Indices to insert the values separated by whitespace: ");
        List<Integer> indices = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).toList();
        scanner.close();
        int resultSize = appendAndCount(arr, values);
        List<Integer> modifiedArrayUsingAdd = insertAtPositionUsingAdd(arr, indices.get(0), values.get(0));
        List<Integer> modifiedArray = insertAtPosition(modifiedArrayUsingAdd, indices.get(0), values.get(0));
        System.out.println("Size of Resulting Array: " + resultSize);
        System.out.println("Modified Array Using in-built add method: " + modifiedArrayUsingAdd);
        System.out.println("Modified Array: " + modifiedArray);
    }

}
