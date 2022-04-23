package pl.sdacademy.java.basic.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task6 {

    public static void main(String[] args) {
        String input = "2022-04-16 13:10:15";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime nextLessons = LocalDateTime.parse(input, formatter);

        LocalDateTime now = LocalDateTime.now();

        Duration duration = Duration.between(now, nextLessons);
        long days = duration.toDaysPart();
        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        int secs = duration.toSecondsPart();
        System.out.println("You have Days: " + days + " Hours: " + hours + " Minutes: " + minutes + " Seconds: " + secs);
        System.out.printf("You have Days: %02d Hours: %02d Minutes: %02d Seconds: %02d", days, hours, minutes, secs);
        System.out.printf("\n%02d:%02d:%02d:%02d", days, hours, minutes, secs);


    }
}