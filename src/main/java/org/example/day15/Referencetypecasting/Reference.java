package org.example.day15.Referencetypecasting;

public class Reference {
    public static void main(String[] args) {
        //형변환은 크다/작다의 관계가 없으면 사용 불가능.
        String[] s = {"가", "나"};
        int[] s2 = {1, 2};
        //s = s2;
        //s2 = s; // 불가능하다. 크기비교가 불가능하기 때문 int와 long의 관계는 형변환 가능하지만 String은 문자이기때문
        // int 방 4개 byte 방 1개

    }
}
