package pl.sdacademy.java.basic.day2;

public class Task6 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char searchedCharacter = 'a';
        System.out.println(getIndex(input,searchedCharacter));


    }

    private static int getIndex(String input, char searchedCharacter) {
        if(StringHelper.isValid(input)) {
            return input.indexOf(searchedCharacter);
        }
        //lub
        /*if(StringHelper.isValid(input) && input.contains(String.valueOf(searchedCharacter))) {
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == searchedCharacter) {
                    return i;
                }
            }
        }*/
        return -1;
    }
}
