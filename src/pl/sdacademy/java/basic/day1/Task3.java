package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert first digit: ");
        int x = scanner.nextInt();
        System.out.print("Please insert second digit: ");
        int y = scanner.nextInt();
        System.out.println("If x is greater than y: " + isBigger(x,y));
        System.out.println("If x * 3 is greater than y: " + iSFirstDigitX3BiggerThanSecond(x,y));
        System.out.println("If y++ is smaller than ++x and --x is smaller than y++: " + isIncrementSmaller(x,y));
        System.out.println("If x * y is even: " + isProductEven(x,y));

    }

    private static boolean isBigger(int firstDigit, int secondDigit) {
        return firstDigit > secondDigit;
    }

    private static boolean iSFirstDigitX3BiggerThanSecond(int firstDigit, int secondDigit) {
        return firstDigit * 3 > secondDigit;
    }

    private static boolean isIncrementSmaller(int firstDigit, int secondDigit) {
        return (secondDigit++ < ++firstDigit) && (--firstDigit < secondDigit++);  //4 < 3 && 2 < 5
    }

    private static boolean isProductEven(int firstDigit, int secondDigit) {
        return (firstDigit * secondDigit) % 2 == 0;
    }

}
