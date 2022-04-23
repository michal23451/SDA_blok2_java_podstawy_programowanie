package pl.sdacademy.java.basic.day1;

public class Task6 {
    public static void main(String[] args) {
        int multiplier = 6;
        int minMultiplicand = 2;
        int maxMultiplicand = 5;
        printMultiplicationTable(multiplier, minMultiplicand, maxMultiplicand);
    }

    //private static void printMultiplicationTable(int multiplier,int minMultiplicand, int maxMultiplicand){
    //    for (int i = minMultiplicand; i <= maxMultiplicand; i++) {
    //        int result = multiplier * i;
    //        System.out.println(multiplier + " x " + i + " = " + result );
    //    }
   // }

    private static void printMultiplicationTable(int multiplier,int minMultiplicand, int maxMultiplicand){
        for (; minMultiplicand <= maxMultiplicand; minMultiplicand++) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " x " + minMultiplicand + " = " + result );
        }
    }

}
