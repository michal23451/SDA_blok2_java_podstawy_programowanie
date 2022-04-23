package pl.sdacademy.java.basic.day3;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        timer();
    }

    private static void timer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("To start timing press ENTER ");
        scanner.nextLine();
        LocalTime startTime = LocalTime.now();

        System.out.print("To stop timing press ENTER ");
        scanner.nextLine();
        LocalTime stopTime = LocalTime.now();

        long durationInSec1 = Duration.between(startTime, stopTime).getSeconds();
        long durationInSec2 = Duration.between(startTime, stopTime).toSeconds();
        System.out.println("Total time: " + durationInSec1 + " sec");
        System.out.println("Total time: " + durationInSec2 + " sec");
    }
}