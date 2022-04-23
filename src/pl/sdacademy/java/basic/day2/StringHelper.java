package pl.sdacademy.java.basic.day2;

public class StringHelper {

    public static boolean isValid(String input) {
        //if(input != null && !input.isBlank()) {
        //    return true;
        //}
       // return false;

        //lub
        //operator trójargumentowy - wyrażenie_logiczne ? operacja_1 : operacja_2;
        //return (input != null && !input.isBlank()) ? true : false;

        //lub nawet
        return input != null && !input.isBlank();
    }
}
