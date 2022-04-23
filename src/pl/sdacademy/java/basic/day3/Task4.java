package pl.sdacademy.java.basic.day3;

import java.util.regex.Pattern;

public class Task4 {
    /*
    true:
    a psik
    a Psik
    aaa psik
    false
    psik
    dummy value
     */
    //private static final String REGEX = "a+ (psik|Psik)";
    //private static final String REGEX = "a+ [pP]sik";
    private static final String REGEX = "a{1,} [pP]sik";

    public static void main(String[] args) {
        System.out.println(isContains("a psik"));
        System.out.println(isContains("a Psik"));
        System.out.println(isContains("aaa psik"));
        System.out.println();
        System.out.println(isContains("psik"));
        System.out.println(isContains("dummy value"));
        System.out.println(isContains("A psik"));
        System.out.println(isContains(""));
        System.out.println(isContains(" "));
    }

    private static boolean isContains(String input) {
        Pattern pattern = Pattern.compile(REGEX);
        return pattern.matcher(input).matches();
    }
}