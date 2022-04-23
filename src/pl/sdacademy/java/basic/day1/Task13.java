package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int digit;
        double average = 0;
        int counter = 0;
        int sum = 0;
        int couterEvenDigits = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Please insert digit: ");
            digit = scanner.nextInt();
            if (digit != 0) {
                counter++;
                sum += digit;
                average = (double)sum / counter; //to można wyciągnąć poza pętlę
                if (digit % 2 == 0) {
                    couterEvenDigits++;
                }
            }
        } while(digit != 0);

        System.out.println("Total Number Of Digits: " + counter);
        System.out.println("Total Number Of Even Digits: " + couterEvenDigits);
        System.out.println("Arithmetic Average: " + average);
    }
}
