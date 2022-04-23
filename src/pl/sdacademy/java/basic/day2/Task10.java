package pl.sdacademy.java.basic.day2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.print("Result: " + wordLastLetters());
    }

    private static String lastChar(String input) {
        return String.valueOf(input.charAt(input.length()-1));
    }

    private static String wordLastLetters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many words would you like insert? ");
        int howManyWords = scanner.nextInt();
        scanner.nextLine();
        String result = "";

        for(int i = 1; i <= howManyWords; i++) {
            String temp = scanner.nextLine();
            if(StringHelper.isValid(temp)) {
                result += lastChar(temp);
            } else {
                System.out.println("String is empty.");
                i--;
            }
        }

        scanner.close();
        return result;

    }

}
