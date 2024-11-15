package org.example.Practice.Static;

public class Q2 {
    public static void main(String[] args) {
        Q2_Day study = new Q2_Day("자바공부", 10, "강남");
        Q2_Day travel = new Q2_Day("여행", 15, "강원도");
        Q2_Day exercise = new Q2_Day("운동", 11, "피트니스");

        System.out.println("전체 하는 일의 시간은: " + Q2_Day.getTotalHours() + "시간");
        System.out.println("평균 하는 일의 시간은: " + Q2_Day.getAverageHours() + "시간");
        System.out.println();

        System.out.println("매일 무엇을 얼마나 어디에서 했는지 프린트:");
        System.out.println(study);
        System.out.println(travel);
        System.out.println(exercise);
    }
}
