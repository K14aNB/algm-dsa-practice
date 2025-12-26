package com.dsa.utils;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Utility {

    private static final Scanner scanner = new Scanner(System.in);

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : List.of(s.split(" "));
    }

    public static List<Integer> getModifiableListOfIntegersFromUserInput() {
        return splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
    }

    public static List<Integer> getUnModifiableListOfIntegersFromUserInput() {
        return splitWords(scanner.nextLine()).stream().map(Integer::parseInt).toList();
    }

    public static int getIntegerFromUserInput() {
        return Integer.parseInt(scanner.nextLine());
    }

}
