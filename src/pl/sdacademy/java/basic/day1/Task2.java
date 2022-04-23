package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

/*
Zadanie 2

Napisz program, który pobierze od użytkownika średnicę okręgu (typu float), a następnie obliczy
obwód oraz pole tego okręgu. Do obliczeń przyjmij:
a) π = 3,14;
b) wartość stałej π z klasy Math.
Przykład:
Please insert diameter: 2,5
Circumference Of A Circle: 7.8500004
Area Of A Circle: 4.90625

 */

public class Task2 {
    private static final float PI = 3.14F;


    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2; //promień
        float circumference = calculateCircumferenceOfACircle(radius);
        float area = calculateAreaOfACircle(radius);
        System.out.println("Circumference of a circle: " + circumference);
        System.out.println("Area of a circle: " + area);
    }

    public static float getDiameterFromUser() { //pobieramy średnicę okręgu
        Scanner scan = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
        //float diameter = scan.nextFloat();
        //return diameter;
        //lub w jednej linii
        return scan.nextFloat();
    }

    private static float calculateCircumferenceOfACircle(float radius) { //obwód okręgu
        return 2 * (float)Math.PI * radius;
        //lub korzystając ze zmiennej globalnej
        //return 2 * PI * radius;
    }

    private static float calculateAreaOfACircle(float radius) {
        return (float)(Math.PI * Math.pow(radius,2));
        //lub korzystając ze zmiennej globalnej
        //return PI * radius * radius;
    }

}
