package pl.sdacademy.java.basic.day2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task12 {
    private static final int ASCII_CODE_a = 97;
    private static final int ASCII_CODE_z = 122;
    private static final int ASCII_DIFFERENCE = ASCII_CODE_z + 1 - ASCII_CODE_a; /*+1 bo dopiero od 123 przeskakujemy do 'a', mamy w sumie zakres 26 liter*/

    public static void main(String[] args) {


        System.out.print("Please insert yout text: ");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        int shift;

        if(isValid(input)) {
            System.out.print("Please insert shift: ");
            shift = myScanner.nextInt();
            myScanner.nextLine();
            System.out.print("Encrypted text: " + caesarCipher(input, shift));

        } else {
            System.out.print("The sentence is incorrect. ");
        }
        myScanner.close();
    }

    public static boolean isValid(String input) {
        Pattern myPattern = Pattern.compile("[a-z ]+");
        Matcher myMatcher = myPattern.matcher(input);
        return myMatcher.matches();
    }

    public static String caesarCipher(String input, int shift) {
        input = input.replace(" ", "");
        StringBuilder output = new StringBuilder();
        int asciiCode;
        for(int i = 0; i < input.length(); i++) {
            asciiCode = input.charAt(i);
            if(input.charAt(i) + shift > ASCII_CODE_z) {
                asciiCode = ASCII_CODE_z + shift - ASCII_DIFFERENCE * (shift / ASCII_DIFFERENCE + 1);
            } else {
                asciiCode += shift;
            }
            //lub
            //asciiCode =  asciiCode + shift > ASCII_CODE_z ? ASCII_CODE_z + shift - 26 * (shift/26 + 1) : asciiCode + shift;
            output.append((char) asciiCode);
        }

        return output.toString();
        //oryg.   bardzo lubie programowac
        //trener: dctfbqnwdkgrtqitcoqyce
        //ja:     dctfbqnwdkgrtqitcoqyce
    }
}
