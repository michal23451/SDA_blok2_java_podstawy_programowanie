package pl.sdacademy.java.basic.day1;

import java.util.Random;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        int randomInt = new Random().nextInt(0,101);
        int myInt;
        String result;
        Scanner scanner = new Scanner(System.in);
        boolean isEqual = false;
        System.out.println("randomInt = " + randomInt);

        do {
            System.out.print("Please insert digit: ");
            myInt = new Scanner(System.in).nextInt();
            result = toMuchOrNotEnough(myInt, randomInt);
            System.out.println(result);
            if(myInt == randomInt) {
                isEqual = true;
            }
        } while (!isEqual);

    }

    private static String toMuchOrNotEnough (int myInt, int randomInt) {
        if(myInt > randomInt) {
            return "too much";
        }
        else if(myInt < randomInt) {
            return "not enough";
        }
        else {
            return "Bingo!";
        }
    }
}
