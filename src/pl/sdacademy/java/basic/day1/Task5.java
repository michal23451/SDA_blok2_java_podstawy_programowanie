package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please insert firstDigit: ");
        int firstDigit = scan.nextInt();

        System.out.print("Please insert secondDigit: ");
        int secondDigit = scan.nextInt();

        int sum = sumOfTheSequence(firstDigit, secondDigit);
        System.out.print("Sum: " + sum);

    }


    private static int sumOfTheSequence(int firstDigit, int secondDigit) {
        int sum = 0;
        for(int i = firstDigit; i <= secondDigit; i++)  {
            sum += i;
        }

        //lub
        //for (; firstDigit <= secondDigit; ) {
        //    sum += firstDigit;
        //}

        //lub
        //while(firstDigit <= secondDigit) {
        //    sum += firstDigit;
        //    firstDigit++;
        //}

        //lub
        //do {
        //    sum += firstDigit;
        //    firstDigit++;
        //} while(firstDigit <= secondDigit);

        return sum;
    }
}
