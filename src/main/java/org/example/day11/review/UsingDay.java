package org.example.day11.review;

public class UsingDay {
    public static void main(String[] args) {
        System.out.println(Day.getAvg());
        System.out.println(Day.count);
        Day day1 = new Day("공부", 8, "삼성동");
        System.out.println(day1);
        // System.out.println(day1.toString());
        // 입력하는 데이터를 바로 db에 연결하면 안돼고 중간에 연결해줄 부품이 필요(db처리 클래스) 응집도 유지를 위해
        // db처리 클래스 전에는 전처리기를 거친다.
        // 전달용클래스를 따로만든다. 코드에서 db로 데이터가 가는과정에서 데이터가 유실될 위험이 있기 때문에 그 데이터를 보존하는게
        // 중요하다.
        Day day2 = new Day("선정릉", 1, "삼성동");
        System.out.println(day2);

        Day day3 = new Day("가만히있기", 8, "삼성동");
        System.out.println(day3);

        System.out.println(Day.count);
        System.out.println(Day.sum);
        System.out.println(Day.getAvg());
    }
}
