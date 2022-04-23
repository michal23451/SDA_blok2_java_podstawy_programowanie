package pl.sdacademy.java.basic.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        printInfo("123");
        printInfo("0");
        printInfo("123,4");
        printInfo("123,456789999");
        printInfo("-123");
        printInfo("-123,45");
        printInfo("0,1");

        System.out.println("\n\n\n");

        printInfo("0123");
        printInfo("0123,45");
        printInfo("123,");
        printInfo(",45");
        printInfo(",");
        printInfo("-0");
        printInfo("-0,123");
        printInfo("-,1");
        printInfo("123,456,789");
        printInfo("123a456");
        printInfo("00,123");



        /*
        true
        123
        0
        123,45
        -123
        -123,56
        0,1

        false
        0123
        0123,45
        123,
        ,45
        -0
        -,1
        12,34,56

         */
    }

    public static boolean isValidNumber(String input){
        Pattern pattern = Pattern.compile("(0|(-?[1-9]+[0-9]*))(,[0-9]+)?");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void printInfo(String input) {
        System.out.println("If digit " + input + " has correct format: " + isValidNumber(input));
    }

    public static boolean isValidNumberxxx(String input) {
        Pattern pattern = Pattern.compile("-?\\d+(,\\d+)?");
        return pattern.matcher(input).matches();
    }
}
