package pl.sdacademy.java.basic.day2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        //int[] array = buildArray();

        int[] array = {5,4,1,3,9,8,5,88,-5,3};
        System.out.println("Input: " + Arrays.toString(array));
        int[] sortedArray = sortArrayV2(array);
        System.out.println("Result: " + Arrays.toString(sortedArray));
    }

    private static int[] buildArray() {
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            System.out.print("Insert digit: ");
            array[i] = scan.nextInt();
        }
        scan.close();
        return array;
    }

    private static int[] sortArray(int[] array){
        int temp;
        for(int i = 0; i < array.length-1;) {
            if(array[i] > array[i+1]) {
                temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
                i = 0;
            } else {
                i++;
            }
        }
        return array;
    }


    //drugi sposób sortowania
    private static int[] sortArrayV2(int[] array){
        int temp;
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j+1]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
