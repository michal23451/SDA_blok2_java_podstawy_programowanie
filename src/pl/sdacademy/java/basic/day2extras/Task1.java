package pl.sdacademy.java.basic.day2extras;


import java.util.Arrays;

public class Task1 {
    private static final int ASCII_DIFFERENCE_BIG_AND_SMALL = 32;

    public static void main(String[] args) {
        String input = "Ala ma kota, a kot ma myszkę";
        System.out.println("Input: " + input);
        System.out.println("Output: " + removeSpaces(input));
        System.out.println("Output v2:" + shortenSms(input));

        String[] words = input.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(input.substring(0, 1));
        System.out.println(input.substring(0, 1));

    }

    private static String removeSpaces(String input) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                i++;
                sb = sb.append((char)(input.charAt(i)-ASCII_DIFFERENCE_BIG_AND_SMALL));
            } else {
                sb = sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }

    //lub
    private static String shortenSms(String input) {
        if(!input.isBlank()) {
            String[] words = input.split(" ");//tworzy tablicę, dzieli elementy w miejscu dzie są spacje
            StringBuilder shortenSms = new StringBuilder();
            for (String word : words) {
                String firstLetter = word.substring(0, 1); //pierwsza litera
                String remainingLetters = word.substring(1); //pozostałe litery
                shortenSms
                        .append(firstLetter.toUpperCase())
                        .append(remainingLetters);
            }
            return shortenSms.toString();
        }
        return input;
    }

}
