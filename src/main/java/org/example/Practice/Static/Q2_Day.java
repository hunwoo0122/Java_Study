package org.example.Practice.Static;

public class Q2_Day {
    private String activity;
    private int hours;
    private String location;

    private static int totalHours = 0;
    private static int totalDays = 0;

    public Q2_Day(String activity, int hours, String location) {
        this.activity = activity;
        this.hours = hours;
        this.location = location;

        totalHours += hours;
        totalDays++;
    }

    public static int getTotalHours() {
        return totalHours;
    }

    public static double getAverageHours() {
        return (double) totalHours / totalDays;
    }

    public String toString() { return activity + " " + hours + "시간, 장소: " + location;}
}
