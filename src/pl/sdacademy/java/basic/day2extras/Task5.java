package pl.sdacademy.java.basic.day2extras;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj, który element ciągu Fibonacciego chcesz wyświetlić: " );
        int element = scanner.nextInt();
        scanner.nextLine();
        System.out.print(element + ". element ciągu Fibonacciego to: " + fibonacci(element));

        scanner.close();
    }

    private static int fibonacci(int element) {
        int result = 0;
        if(element == 0) {
            result = 0;
        } else if (element == 1) {
            result = 1;
        } else if(element > 1){
            int element1 = 1; //element poprzedni
            int element2 = 0; //element poprzedni poprzedniego
            for(int i = 2; i <= element; i++) {
                result = element1 + element2;
                element2 = element1;
                element1 = result;

            }
        }
        return result;
    }
}
