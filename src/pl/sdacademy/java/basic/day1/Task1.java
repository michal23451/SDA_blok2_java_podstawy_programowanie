package pl.sdacademy.java.basic.day1;

/*
Zadanie 1
Napisz program, który wyświetli na ekranie wyraz SDA, nie używając ani jednego znaku " lub '.
 */


public class Task1 {
    public static void main(String[] args) {
        displayWordUsingDecimalFormat();
    }

    private static void displayWordUsingDecimalFormat() {
        //kody ASCII Dec
        char s = 83;
        char d = 68;
        char a = 65;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);

        //kody ASCII Bin
        s = 0b01010011;
        d = 0b01000100;
        a = 0b01000001;
        System.out.print("\n");
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);

        //kody ASCII Hex
        s = 0x53;
        d = 0x44;
        a = 0x41;
        System.out.print("\n");
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }

}
