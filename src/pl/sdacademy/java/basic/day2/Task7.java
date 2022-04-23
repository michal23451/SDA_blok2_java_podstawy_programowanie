package pl.sdacademy.java.basic.day2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.print("Input: ");
        input = scanner.nextLine();
        //System.out.println("Spaces: " + countSpaces(input));
        //System.out.println("Length: " + input.length());
        System.out.println("Result: " + percentSpaces(input) );
    }

    private static int countSpaces(String input) {
        int counter = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' ') {
                counter++;
            }
        }
        return counter;
    }

    private static double percentSpaces(String input) {
        return ((double) countSpaces(input) / input.length() * 100) ;
    }
}
