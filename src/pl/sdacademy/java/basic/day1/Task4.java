package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task4 {
    private static final Scanner scan = new Scanner(System.in);
    private static final double BMI_MIN_RANGE = 18.5;
    private static final double BMI_MAX_RANGE = 24.9;

    public static void main(String[] args) {
        float weihgt = getWeightFromUser();
        int height = getHeightFromUser();
        float bmi = calculateBMI(weihgt, height);
        displayBmiResult(bmi);

    }

    private static float getWeightFromUser() {
        System.out.print("Please insert weight in kg: ");
        return scan.nextFloat();
    }

    private static int getHeightFromUser() {
        System.out.print("Please insert height in cm: ");
        return scan.nextInt();
    }

    private static float calculateBMI(float weight, int height) {
        // weight / height[m]^2
        float heigtOnmeter = height/100F;
        return weight / (float) Math.pow(heigtOnmeter, 2);
    }

    private static void displayBmiResult(float bmi) {
        if (bmi < BMI_MIN_RANGE || bmi > BMI_MAX_RANGE) {
            System.out.println("BMI is not correct: " + bmi);
        }
        else {
            System.out.println("BMI is correct: " + bmi);
        }
    }



}
