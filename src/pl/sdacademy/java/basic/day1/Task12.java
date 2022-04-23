package pl.sdacademy.java.basic.day1;

public class Task12 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Modulo = " + 5%10);
        System.out.println("ownModuloImplementation = " + ownModuloImplementation(a, b));
        System.out.println("isOwnModuloImplementationIsCorrect = " + ifOwnModuloImplementationIsCorrect(a, b));
    }

    private static int ownModuloImplementation(int a, int b) {
        int counter = 0;
        if(a == b || b == 1){
            return 0;
        }
        else if(a < b) {
            return a;
        }
        else { // a > b
            for (int i = b; i <= a; i = i + b) {
                counter++;
            }
            return a - b * counter;
        }
        //można prościej:
        //return a - (a / b) * b;
    }

    private static boolean ifOwnModuloImplementationIsCorrect(int a, int b) {
        return a%b == ownModuloImplementation(a, b);

    }

}
