package org.example.day8.makingclass;

public class Diary {
    //속성 --> 항목, 멤버변수
    public String title;
    public String content;
    public String weather;
    //기능 --> 메서드, 멤버메서드
    //void(없다)
    public void WritingDiary() {
        System.out.println("그림하나 넣고.");
        System.out.println("제목넣고, 내용쓰고, 날씨를 쓴다.");
    }

    public void DeleteDiary() {
        System.out.println("파일을 삭제한다.");
        System.out.println("제목을 삭제한다.");
    }
}
