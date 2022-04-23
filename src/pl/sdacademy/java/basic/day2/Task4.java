package pl.sdacademy.java.basic.day2;

public class Task4 {
    private static final String REPLACEMENT = "-STOP-";

    public static void main(String[] args) {
        String input = "Ala, ma kota. Kot, ma Ale.";
        String result = replaceString(input);
        System.out.println(result);
    }

    private static String replaceString(String input) {
        if(StringHelper.isValid(input)) {
//            String tmp = input.replace(".", "-STOP-");
//            return tmp.replace(",", "-STOP-");
//            return input
//                    .replace(".", REPLACEMENT)
//                    .replace(",", REPLACEMENT);
            return input.replaceAll("[.,]", REPLACEMENT);
        }
        return input;
    }
}
