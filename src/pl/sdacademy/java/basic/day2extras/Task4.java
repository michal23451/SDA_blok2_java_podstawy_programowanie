package pl.sdacademy.java.basic.day2extras;

import java.util.Arrays;

public class Task4 {
    private static final char STAR = '*';
    private static final int WAVE_HEIGHT = 4;
    private static final int WAVE_LENGTH = 26;


    public static void main(String[] args) {
        int waveLength = 26;
        char[][] array = generateWave(waveLength);
        printArray(array);

        //2 sposób (trenera)
        //System.out.println("\n\n");
        //char[][] array2 = generateEmptyArray(waveLength);
        //addStarsToMatrix(array2);
        //printArray(array2);


    }

    private static char[][] generateEmptyArray(int length) {
        char[][] array = new char[4][length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ' ';
            }
        }
        return array;
    }

    private static void printArray(char[][] input) {
        for (char[] element : input) {
            for (char element2 : element) {
                System.out.print(element2 + " ");
            }
            System.out.println();
        }
    }

    private static char[][] generateWave(int length) {
        char[][] wave = generateEmptyArray(length);
        int r = 0; //rows
        int c = 0; //columns
        while (c < length) {

            /*
            if(r == 0) {
                while (r <= 3 && c < length) {
                    wave[r][c] = '*';
                    r++;
                    c++;
                }
            }

            if(r == 4) {
                r--; //r = 3
                while (r >= 0 && c < length) {
                    wave[r][c] = '*';
                    r--;
                    c++;
                }
            }

            if(r == -1) {
                r++; //r = 0
                while (r <= 3 && c < length) {
                    wave[r][c] = '*';
                    r++;
                    c++;
                }
            }
            */

            //refaktoring
            while (r <= 3 && c < length) {
                wave[r][c] = '*';
                r++;
                c++;
            }
            r--; //ustawia r = 3

            while (r >= 0 && c < length) {
                wave[r][c] = '*';
                r--;
                c++;
            }
            r++; //ustawia r = 0


        }
        return wave;
    }

    //metoda trenera
    private static void addStarsToMatrix(char[][] arrays) {
        int counter = 0;
        boolean isGoingDown = true;
        for (int i = 0; i < WAVE_LENGTH; i++) {
            arrays[counter][i] = STAR;
            if (isGoingDown) {
                if (counter == WAVE_HEIGHT - 1) {
                    isGoingDown = false;
                    continue;
                }
                counter++;
            } else {
                if (counter == 0) {
                    isGoingDown = true;
                    continue;
                }
                counter--;
            }
        }

    }
}
