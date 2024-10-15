package org.example.day10.Static;

public class Day {
    String doing;
    int time;
    String location;
    //count 너는 가만히 있어서 값을 누적시켜줘
    static int count;


    public Day(String doing, int time, String location) {
        count++;
        this.doing = doing;
        this.time = time;
        this.location = location;
    }


    public String toString() {
        return doing + " " + time + " " + location;
    }
}
