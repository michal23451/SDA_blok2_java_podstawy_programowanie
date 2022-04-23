package pl.sdacademy.java.basic.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String input = "PL10105000997603123456789123";
        System.out.println(showInfo(input));

        String input2 = "PL1010";
        System.out.println(showInfo(input2));
    }

    private static boolean isValidIBAN(String input) {
        Pattern pattern = Pattern.compile("PL[0-9]{26}");
        return pattern.matcher(input).matches();
        //lub
        //Matcher matcher = pattern.matcher(input);
        //return matcher.matches();
    }

    private static String showInfo(String input) {
        //String output = "If PL IBAN " + input + " has correct format: " + isValidIBAN(input);
        //return output;
        return "If PL IBAN " + input + " has correct format: " + isValidIBAN(input);
    }
}
