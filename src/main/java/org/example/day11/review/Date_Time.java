package org.example.day11.review;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

        LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);

    }
}
