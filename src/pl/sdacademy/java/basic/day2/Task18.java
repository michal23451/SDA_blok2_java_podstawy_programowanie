package pl.sdacademy.java.basic.day2;

import java.util.Arrays;
import java.util.Random;

public class Task18 {
    public static void main(String[] args) {
        int[] array = genArray();
        System.out.println("Input: " + Arrays.toString(array));
        int[] counter = countDigit(array);
        printResult(counter);
    }

    private static int[] genArray() {
        int[] array = new int[10];
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,10);
        }
        return array;
    }

    private static int[] countDigit(int[] input) {
        int[] counter = new int[10];
        for(int i = 0; i < input.length; i++) {
            counter[input[i]]++;
        }
        return counter;
    }

    private static void printResult(int[] input) {
        for(int i = 0; i <input.length; i++) {
            System.out.println(i + ": " + input[i]);
        }
    }
}
