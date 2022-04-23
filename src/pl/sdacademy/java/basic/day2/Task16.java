package pl.sdacademy.java.basic.day2;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int[] input = {12, 7, 19, 33, 5};
        System.out.println("Input:  " + Arrays.toString(input));
        System.out.println("Result: " + Arrays.toString(reverseArray(input)));
    }

    private static int[] reverseArray(int[] input) {
        int temp;
        int maxIndex = input.length - 1;
        for(int i = 0; i < input.length / 2; i++) {
            temp = input[i];
            input[i] = input[maxIndex-i];
            input[maxIndex-i] = temp;
        }
        return input;
    }
}
