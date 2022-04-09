package com.test.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class IntArrayWithStream {

    public static void main(String[] args) {
        int[] arr = {10, 3, 20, 4, 7, 0};

        int sum = 0;
        sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        int[] arr1 = {};

        arr1 = Arrays.stream(arr).sorted().toArray();

        // Direct printing object
        System.out.println("Direct printing object");
        System.out.println(arr1);

        // For loop
        System.out.println("For loop");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // Using Stream
        System.out.println("Using Stream");
        Arrays.stream(arr1).forEach(e -> System.out.println(e + " "));

        // Using List and Stream
        System.out.println("Using List and Stream");
        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(integerArray);

    }
}
