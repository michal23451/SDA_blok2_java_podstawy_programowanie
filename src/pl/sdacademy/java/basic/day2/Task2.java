package pl.sdacademy.java.basic.day2;

public class Task2 {

    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";

        System.out.println("PREFIX: ");
        boolean result = isWordContainsPrefix(input, prefix);
        System.out.println(result);

        result = isWordContainsPrefix(input, null);
        System.out.println(result);

        result = isWordContainsPrefix("", "");
        System.out.println(result);

        System.out.println("SUFIX: ");
        input = "programowanie";
        String suffix = "nie";
        result = isWordContainsSufix(input, suffix);
        System.out.println(result);


    }

    private static boolean isWordContainsPrefix(String input, String prefix) {
        if(StringHelper.isValid(input) && StringHelper.isValid(prefix)) {
            return input.startsWith(prefix);
        }
        return false;
        //można jeszcze krócej
        //return StringHelper.isValid(input) && input.startsWith(prefix);
    }

    private static boolean isWordContainsSufix(String input, String suffix) {
       // if(StringHelper.isValid(input) && StringHelper.isValid(suffix)) {
       //     return input.endsWith(suffix);
       // }
       // return false;
        //można jeszcze krócej
        return StringHelper.isValid(input) && input.endsWith(suffix);

    }
}