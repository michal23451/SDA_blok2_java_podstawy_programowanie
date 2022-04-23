package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task7 {
    private static final String STOP_DECISION = "Stop";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String decision;
        do {
            System.out.print("Please insert firstDigit: ");
            float firstDigit = scan.nextFloat();
            scan.nextLine();

            System.out.print("Please insert operator: ");
            String operator = scan.nextLine();

            System.out.print("Please insert secondDigit: ");
            float secondDigit = scan.nextFloat();
            scan.nextLine();


            if(!checkOperator(operator)) {
                System.out.println("Operator not exist");
                break; //wyjdzie z pętli i wykona się to co ewentualnie jest za pętlą (alternatywnie return - zakończy program w tym miejscu)
            }
            else if(!checkOperation(secondDigit, operator)) {
                System.out.println("Wrong operation");
            }
            else {
                float result = calculate(firstDigit, secondDigit, operator);
                System.out.println("Result: " + result);
            }

            System.out.print("New calculation or Stop? ");
            decision = scan.nextLine();

        } while (!STOP_DECISION.equals(decision));

    }

    private static float calculate(float firstDigit, float secondDigit, String operator) {
        float result = 0;
        switch (operator) {
            case "+":
                result = firstDigit + secondDigit;
                break;
            case "-":
                result = firstDigit - secondDigit;
                break;
            case "*":
                result = firstDigit * secondDigit;
                break;
            case "/":
                result = firstDigit / secondDigit;
                break;
        }
        return result;
    }

    private static boolean checkOperator(String operator) {
        if(operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*")) {
            return true;
        }
        else {
            return false;
        }
    }

    private static boolean checkOperation(float secondDigit, String operator) {
        if(secondDigit == 0 && operator.equals("/")) {
            return false;
        }
        return true;
        //lub
        //return !(secondDigit == 0 && operator.equals("/"));
    }

}
