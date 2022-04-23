package pl.sdacademy.java.basic.day2;


import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {
        int[] array = generateArithmeticSequence(5, 3, 3);
        System.out.println(Arrays.toString(array));
        System.out.println(isArithmeticSequence(array));

        int[] testArray = {-2, 0,4,6,8,10};
        System.out.println(isArithmeticSequence(testArray));

    }

    private static int[] generateArithmeticSequence(int length, int firstElement, int odds) {
        int[] array = new int[length];
        for(int i = 0; i < array.length; i++) {
            if(i == 0) {
                array[i] = firstElement;
            } else if(i > 0) {
                array[i] = firstElement + odds;
                firstElement = firstElement + odds;
            }
        }
        return array;
    }

    private static boolean isArithmeticSequence(int[] input) {
        boolean result = false;
        for(int i = 0; i < input.length - 2; i++) {
            if(input[i] - input[i+1] == input[i+1] - input[i+2]) {
                result = true;
            } else {
                return result;
            }
        }
        return result;
    }
}
