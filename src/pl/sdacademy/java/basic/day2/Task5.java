package pl.sdacademy.java.basic.day2;

public class Task5 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char searchedCharacter = 'a';

        System.out.println(countChar(input,searchedCharacter));
    }

    private static int countChar(String input, char searchedCharacter) {
        int counter = 0;
        if(StringHelper.isValid(input) && input.contains(String.valueOf(searchedCharacter))) { //contains sprawdza czy jeden tekst zawiera się w drugim tekście)
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == searchedCharacter) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
