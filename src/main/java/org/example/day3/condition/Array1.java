package org.example.day3.condition;

public class Array1 {
    public static void main(String[] args) {
        //배열을 만드는 방법 2가지
        //공간을 여러개 만들 때(배열) 처음에 값을 모르는 경우
        //유한 공간, 동일한 타입일 때
        int[] s = new int[5]; //{0,0,0,0,0} 배열은 선언을 안하면 0으로 자동초기화(주소 저장) int[]: 정수형 배열 데이터타입
        // 첫번째 값 프린트
        // 첫번째 값==> s안에 주소가 가르키고 있는 공간 s[0]
        // 두번째 ==> s안에 주소가 가르키고 있는 공간 s[1]
        System.out.println("첫번째 값==> " + s[0]);
        System.out.println("두번째 값==> " + s[1]);

        s[0] = 100; // 100초기화
        System.out.println("첫번째 값==> " + s[0]);
        // 공간을 여러개 만들 때 처음부터 값을 알고 있는 경우
        int[] s2 = {100, 200, 300, 400, 500}; //5(length)
        System.out.println("첫번째 값==> " + s2[0]);
        System.out.println("두번째 값==> " + s2[1]);
        System.out.println(s2.length);

    }
}
