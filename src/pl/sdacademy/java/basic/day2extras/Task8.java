package pl.sdacademy.java.basic.day2extras;

import java.sql.Array;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        print2dArray(generateArray());
        System.out.println("\n\n\n");
        print2dArray(generateArrayV2());
    }

    private static int[][] generateArray() {
        int[][] array = new int[3][10];
        for(int r = 0; r < array.length; r++)
            for(int c = 0; c < array[r].length; c++) {
                if(r == 0) {
                    array[r][c] = c + 1;
                }
                if(r == 1) {
                    array[r][c] = array[r - 1][c] * array[r - 1][c];
                }
                if(r == 2) {
                    array[r][c] = array[r - 1][c] * array[r - 2][c];
                }
            }
        return array;
    }

    //refaktoring
    private static int intPow(int a, int b) {
        return (int)Math.pow(a, b);
    }

    private static int[][] generateArrayV2() {
        int[][] array = new int[3][10];
        for(int r = 0; r < array.length; r++)
            for(int c = 0; c < array[r].length; c++) {
                if(r == 0) {
                    array[r][c] = c + 1;
                } else if(r > 0) {
                    array[r][c] = intPow(array[0][c], r + 1);
                }

            }
        return array;
    }

    private static void print2dArray(int[][] input) {
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
