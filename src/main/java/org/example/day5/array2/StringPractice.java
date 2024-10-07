package org.example.day5.array2;

public class StringPractice {
    public static void main(String[] args) {
        String tel = "    011-245-1234";
        //1. 공백제거
        tel = tel.trim();
        System.out.println(tel);
        //2. -을 기준으로 분리하기
        String[] datas = tel.split("-");
       for(String data : datas) {
           System.out.println(data);
       }
       //3. 첫번째 문자열이 011이면 SK, 019이면 LG, 나머지이면 Apple이다.
       if(tel.substring(0, 3).equals("011")){
           System.out.println("SK입니다.");
       }else if(tel.substring(0, 3).equals("019")){
           System.out.println("LG입니다.");
       }else{
           System.out.println("Apple입니다.");
       }
        //4. 두번째 문자열의 길이가 4개이상이면 최신폰, 아니면 올드폰
        if (datas[1].length() >= 4) {
            System.out.println("최신폰입니다.");
        } else {
            System.out.println("올드폰입니다.");
        }
        //5. 전체 전화번호의 길이가 10글자 이상이면 유효 전화번호
        if (tel.length() >= 10) {
            System.out.println("유효한 전화번호");
        } else {
            System.out.println("유효하지 않은 전화번호");
        }
        //아니면 유효하지 않은 전화번호
    }
}
