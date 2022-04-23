package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task14 {
    private static final double MIN_AMOUNT = 100;
    private static final double MAX_AMOUNT = 10000;
    private static final double DEFAULT_MIN_AMOUNT = 1000;
    private static final double DEFAULT_MAX_AMOUNT = 5000;
    private static final int MIN_NUMBER_OF_INSTALLMENTS = 6;
    private static final int MAX_NUMBER_OF_INSTALLMENTS = 48;
    private static final int DEFAULT_MIN_NUMBER_OF_INSTALLMENTS = 18;
    private static final int DEFAULT_MAX_NUMBER_OF_INSTALLMENTS = 36;
    private static final int FIRST_INSTALLMENT_THRESHOLD_FROM = 6;
    private static final int FIRST_INSTALLMENT_THRESHOLD_TO = 12;
    private static final int SECOND_INSTALLMENT_THRESHOLD_FROM = 13;
    private static final int SECOND_INSTALLMENT_THRESHOLD_TO = 24;
    private static final int THIRD_INSTALLMENT_THRESHOLD_FROM = 25;
    private static final int THIRD_INSTALLMENT_THRESHOLD_TO = 48;
    private static final double FIRST_RATE_THRESHOLD = 0.025;
    private static final double SECOND_RATE_THRESHOLD = 0.05;
    private static final double THIRD_RATE_THRESHOLD = 0.10;

    public static void main(String[] args) {
        startApp();
    }

    private static double checkAmount(double amount) {
        if(amount < MIN_AMOUNT) {
            amount = DEFAULT_MIN_AMOUNT;
        } else if(amount > MAX_AMOUNT) {
            amount = DEFAULT_MAX_AMOUNT;
        }
        return amount;
    }

    private static int checkNumberOfInstallments(int numberOfInstallments) {
        if(numberOfInstallments < MIN_NUMBER_OF_INSTALLMENTS) {
            numberOfInstallments = DEFAULT_MIN_NUMBER_OF_INSTALLMENTS;
        } else if(numberOfInstallments > MAX_NUMBER_OF_INSTALLMENTS) {
            numberOfInstallments = DEFAULT_MAX_NUMBER_OF_INSTALLMENTS;
        }
        return numberOfInstallments;
    }

    private static double calculateInstallment (double amount, int numberOfInstallments) {
        double loanInstallment=0;//rata kredytu
        if(numberOfInstallments >= FIRST_INSTALLMENT_THRESHOLD_FROM && numberOfInstallments <= FIRST_INSTALLMENT_THRESHOLD_TO) {
            loanInstallment = (amount * (1 + FIRST_RATE_THRESHOLD)) / numberOfInstallments;
        } else if(numberOfInstallments >= SECOND_INSTALLMENT_THRESHOLD_FROM && numberOfInstallments <= SECOND_INSTALLMENT_THRESHOLD_TO) {
            loanInstallment = (amount * (1 + SECOND_RATE_THRESHOLD)) / numberOfInstallments;
        } else if(numberOfInstallments >= THIRD_INSTALLMENT_THRESHOLD_FROM && numberOfInstallments <= THIRD_INSTALLMENT_THRESHOLD_TO) {
            loanInstallment = (amount * (1 + THIRD_RATE_THRESHOLD)) / numberOfInstallments;
        }
        return Math.round(loanInstallment * 100.0) / 100.0;
    }

    private static void startApp() {
        double amount; //kwota
        int numberOfInstallments; //ilość rat
        double singleInstalment; //wyliczona kwota raty
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please insert amount: ");
        amount = myScanner.nextDouble();
        if(amount > MAX_AMOUNT) {
            System.out.println("Amount is too big. Default vaule " + DEFAULT_MAX_AMOUNT + " was set.");
        } else if(amount < MIN_AMOUNT) {
            System.out.println("Amount is too small. Default vaule " + DEFAULT_MIN_AMOUNT + " was set.");
        }
        amount = checkAmount(amount);

        System.out.print("Please insert number of installments: ");
        numberOfInstallments = myScanner.nextInt();
        myScanner.nextLine();
        if(numberOfInstallments > MAX_NUMBER_OF_INSTALLMENTS) {
            System.out.println("Number of installments is too big. Default vaule " + DEFAULT_MAX_NUMBER_OF_INSTALLMENTS + " was set.");
        } else if(numberOfInstallments < MIN_NUMBER_OF_INSTALLMENTS) {
            System.out.println("Number of installments is too small. Default vaule " + DEFAULT_MIN_NUMBER_OF_INSTALLMENTS + " was set.");
        }
        numberOfInstallments = checkNumberOfInstallments(numberOfInstallments);

        singleInstalment = calculateInstallment(amount, numberOfInstallments);
        System.out.println("Single instalment: " + singleInstalment);
        myScanner.close();
    }

}

