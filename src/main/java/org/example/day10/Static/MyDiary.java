package org.example.day10.Static;

public class MyDiary {
    public static void main(String[] args) {
        Day day1 = new Day("자바공부" , 10, "강남");
        Day day2 = new Day("여행", 15, "강원도");
        Day day3 = new Day("운동", 11, "피트니스");

        System.out.println("전체 하는 일의 시간은? " + (day1.time + day2.time + day3.time) +"시간");
        System.out.println("평균 하는 일의 시간은? " + (double)((day1.time + day2.time + day3.time)/3)+"시간");
        System.out.println(day1);
    }
}
