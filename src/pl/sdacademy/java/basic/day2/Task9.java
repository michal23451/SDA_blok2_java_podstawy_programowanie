package pl.sdacademy.java.basic.day2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String longestWord = "";
        do {
            System.out.print("Please insert your text: ");
            input = scanner.nextLine();

            if(input.isEmpty()) {
                System.out.println("No input");
            } else if(!input.equals("Enough") && input.length() > longestWord.length()) {
                longestWord = input;
            }
        } while(!input.equals("Enough"));

        System.out.println(longestWord);

    }
}
