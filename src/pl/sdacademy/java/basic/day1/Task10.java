package pl.sdacademy.java.basic.day1;

public class Task10 {
    private static final int DIFFERENCE_ASCII_AND_INT = 48;

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
        System.out.println(sumOfDigits(992517));
    }

    private static int sumOfDigits(int input) {
        String inputString = String.valueOf(input);
        int sum = 0;
        for(int i = 0; i < inputString.length(); i++) {
            sum += inputString.charAt(i)-DIFFERENCE_ASCII_AND_INT;
        }
        return sum;
    }

    //lub wersja trenera
    /*
    public static int sumOfDigits(int number) {
        int sum = 0;
        if(number > 9) {
            while (number != 0) {

                //aby rozpatrywać liczbę cyfra po cyfrze, możemy obliczać resztę z dzielenia liczby
                //przez 10 (aby uzyskać wartość ostatniej cyfry) i dzielić liczbę bez reszty przez 10 (żeby przesuwać
                //się do kolejnej cyfry)

    sum += number % 10;
    number /= 10;
}
        } else {
                sum = number;
                }

   //     if(number > 9) {
   //         do {
    //            sum += number % 10;
    //            number /= 10;
    //        } while (number != 0);
    //    } else {
    //        sum = number;
    //    }

                return sum;
                }
     */
}
