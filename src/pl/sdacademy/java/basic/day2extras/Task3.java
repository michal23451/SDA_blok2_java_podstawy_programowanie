package pl.sdacademy.java.basic.day2extras;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1,0,5,10,0,6};
        System.out.println(Arrays.toString(array));
        zerosAtEnd(array);
        System.out.println(Arrays.toString(array));
    }

    private static void zerosAtEnd(int[] input) {
        int countZeros = 0;
        for(int i = 0; i < input.length - countZeros; i++) {
            if(input[i] == 0) {
                int tmp = input[i]; //0
                countZeros++;
                for(int j = i; j < input.length - countZeros; j++) { //przesuwamy wartości o jedną komórkę do tyłu
                    input[j] = input[j+1];
                }
                input[input.length - countZeros] = tmp;
            }
        }
    }
}
