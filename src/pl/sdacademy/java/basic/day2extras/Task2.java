package pl.sdacademy.java.basic.day2extras;

import java.util.Locale;

import static java.lang.Math.abs;

public class Task2 {
    public static void main(String[] args) {
        char firstChar = 'B';
        char secondChar = 'a';
        System.out.println("First char: \t" + firstChar);
        System.out.println("Second char: \t" + secondChar);
        System.out.println("Distance: \t" + charDistance(firstChar, secondChar));
    }

    private static char replaceCharToSmall(char input) {
        if(input >= 65 && input <= 90) {
            input += 32;
        }
        return input;
    }

    private static int charDistance(char firstChar, char secondChar) {
        //wersja z zamianą na String
        //String firstString = String.valueOf(firstChar).toLowerCase();
        //String secondString = String.valueOf(secondChar).toLowerCase();
        //firstChar = firstString.charAt(0);
        //secondChar = secondString.charAt(0);

        //wersja z użyciem metody replaceCharToSmall
        firstChar = replaceCharToSmall(firstChar);
        secondChar = replaceCharToSmall(secondChar);
        int distance = abs(firstChar - secondChar);
        return distance;
    }

    //sposób trenera
    private static int getDistanceBetweenChars(char firstChar, char secondChar) {
        // tutaj możemy wykorzystać metodę abs z klasy Math, oraz metody z klasy Character do zamieniania charów na małe litery
        return Math.abs(Character.toLowerCase(secondChar) - Character.toLowerCase(firstChar));
    }

}
