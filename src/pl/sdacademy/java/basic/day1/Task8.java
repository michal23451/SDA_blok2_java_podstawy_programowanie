package pl.sdacademy.java.basic.day1;

public class Task8 {
    public static void main(String[] args) {
        int rangeFrom = 0;
        int rangeTo = 10;
        for (int i = rangeFrom; i <= rangeTo; i++) {
            if (isPrimeNumbers(i)) {
                System.out.println(i);
            }
        }


    }

    private static boolean isPrimeNumbers (int number) {
        if(number < 2) {
            return false;
        }
        for(int i = 2; i <= number/2; i++) {
            if(number % i ==0) {
                return false;
            }
        }
    return true;
    }


}
