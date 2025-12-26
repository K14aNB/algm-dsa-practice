package com.dsa.arrays;

import java.util.List;

import com.dsa.utils.Utility;

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

    public static void main(String[] args) {
        System.out.print("Enter Array Elements separated by whitespace: ");
        List<Integer> modifiableArray1 = Utility.getModifiableListOfIntegersFromUserInput();
        System.out.print("Enter Values to be inserted into Array separated by whitespace: ");
        List<Integer> values = Utility.getUnModifiableListOfIntegersFromUserInput();
        System.out.print("Enter Array Elements separated by whitespace: ");
        List<Integer> modifiableArray2 = Utility.getModifiableListOfIntegersFromUserInput();
        System.out.print("Enter index for the value to be inserted: ");
        int index1 = Utility.getIntegerFromUserInput();
        System.out.print("Enter value to be inserted: ");
        int value1 = Utility.getIntegerFromUserInput();
        System.out.print("Enter Array Elements separated by whitespace: ");
        List<Integer> modifiableArray3 = Utility.getModifiableListOfIntegersFromUserInput();
        System.out.print("Enter index for the value to be inserted: ");
        int index2 = Utility.getIntegerFromUserInput();
        System.out.print("Enter value to be inserted: ");
        int value2 = Utility.getIntegerFromUserInput();
        int resultSize = appendAndCount(modifiableArray1, values);
        List<Integer> modifiedArrayUsingAdd = insertAtPositionUsingAdd(modifiableArray2, index1, value1);
        List<Integer> modifiedArray = insertAtPosition(modifiableArray3, index2, value2);
        System.out.println("Size of Resulting Array: " + resultSize);
        System.out.println("Modified Array Using in-built add method: " + modifiedArrayUsingAdd);
        System.out.println("Modified Array: " + modifiedArray);
    }

}
