package pl.sdacademy.java.basic.day2;

import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {
        int[][] firstArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] secondArray = {
                {10, -1, 5},
                {-25, 6, 6},
                {12, 8, 9}
        };

        int[][] biggerArray = compareSumOfElements(firstArray,secondArray);
        System.out.println("Bigger array is: " + Arrays.deepToString(biggerArray));

        int maxNumber = maxElementOfArrays(firstArray, secondArray);
        System.out.println("The biggest value is: " + maxNumber);

        int minNumber = minElementOfArrays(firstArray, secondArray);
        System.out.println("The lowest value is: " + minNumber);



    }

    /*
    private static void print2dArray(int[][] input) {
        for(int[] element : input) {
            System.out.print(Arrays.toString(element));
        }
    }
    */

    private static int sumOfElements(int[][] input) {
        int sum = 0;
        for(int[] element : input) {
            for (int i : element){
                sum += i;
            }
        }
        return sum;
    }

    //wersja z for each
    private static int minElement(int[][] input) {
        int min = Integer.MAX_VALUE;
        for(int[] element : input) {
            for (int i : element){
                if(i < min) {
                    min = i;
                }
            }
        }
        return min;
    }

    //wersja z for
    private static int maxElement(int[][] input) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < input.length /* zwraca ilość wierszy */; i++) {
            for(int j = 0; j < input[i].length /* zwraca ilość kolumn w wierszu o indeksie i */; j++) {
                if(input[i][j] > max) {
                    max = input[i][j];
                }
            }
        }
        return max;
    }

    private static int[][] compareSumOfElements(int[][] firstArray, int[][] secondArray){
        int sum1 = sumOfElements(firstArray);
        int sum2 = sumOfElements(secondArray);
        return sum1 > sum2 ? firstArray : secondArray;
    }

    private static int minElementOfArrays(int[][] firstArray, int[][] secondArray) {
        int min1 = minElement(firstArray);
        int min2 = minElement(secondArray);
        return min1 < min2 ? min1 : min2;
    }

    private static int maxElementOfArrays(int[][] firstArray, int[][] secondArray) {
        int max1 = maxElement(firstArray);
        int max2 = maxElement(secondArray);
        return max1 > max2 ? max1 : max2;
    }
}
