package org.example.day5.review;

import java.util.Random;

public class exam1 {
    public static void main(String[] args) {
        /*
        문제 1번
        int[] term1 = {77, 88, 99, 55, 70}; // 무더기영역의 주소
        int[] term2 = {99, 100, 88, 80, 70};
        // 1. 성적이 2학기에 향상된 학생의 수를 카운트해서 프린트
        // 2. 성적이 1, 2학기 동일한 학생의 수를 카운트해서 프린트
        // c타입의 for문: i를 이용가능, 입력/출력 가능, 여러개의 배열을 다룰 때
        // for-each문 : 간단, 출력만 가능, 하나의 배열을 다룰 때
        // 누적시키는 변수는 반복문 안에 넣으면 x
        int high = 0, same = 0;
        for (int i = 0; i < term1.length; i++) {
            if (term1[i] == term2[i]) {
                //조건에 해당하는 구문은 결과가 무조건 논리형
                same++;
            }else if (term1[i] < term2[i]) {
                high++;
            } //if
        } // for
        System.out.println(high + " " + same);
        */
        /* 문제 2번
        Scanner sc = new Scanner(System.in); // <-- 이 코드가 주석이 아니면 따로 선언할 필요 없음 이 클래스에 쭉 쓸수 있음
        int [] data = new int[3]; //{0,0,0}
        for (int i = 0; i < data.length; i++) {
            System.out.print("숫자 입력: ");
            data[i] = sc.nextInt(); //만약 nextInt가 아니라 next이면 스트링을 입력함
        }
        System.out.println(Arrays.toString(data));
        //Arrays.toString(data) ==> 배열에 있는 데이터를 가져다가 "[값, 값, 값]" String으로 만들어준다.
        //합, 평균(2번째 패턴)
        int sum = 0;
        for (int x : data) {
            sum += x;
        }
        System.out.println(sum);
        System.out.println(sum / (double)data.length); // 1.
        System.out.println((double)sum / data.length); // 2.
        System.out.println((double)sum /(double) data.length); // 3.
        System.out.println((double)(sum / data.length)); // 4. 4번이 잘못된 식이다. 왜냐하면 이미 정수로 계산이 됬는데
        //거기에 정수인 값을 double로 바꾸면 소숫점이 모두 0으로 바뀐다.
        double result = (double)(sum / data.length); // 5.
        //산술 연산시 하나라도 실수이면 결과는 실수이다.
        */
        /* 문제 3
        Random r = new Random(44);
        int[] n = new int[1000];
        int sum2 = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(1000) + 1;
            //0~999 ==> 1~1000
            //r.nextInt(범위최대값) + 범위최소값
            sum2 = sum2 + n[i]; // sum2 += n[i]
        } // 할 수 있으면 for문을 최소화 시키는게 성능이 좋아진다.
        System.out.println(Arrays.toString(n));
        System.out.println(n[0] + n[2] + n[4] + n[99] + n[989]);
        System.out.println(sum2);
        System.out.println((double)sum2 / n.length);
        */
        // 문제4
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산 입력: ");
        //입력 --> 처리(저장) --> 출력
        int input = sc.nextInt();//1, 2, 3
        String result = null; //주소가 없다. 참조형 string타입은 빈값이면 null값이다.
        switch (input) {
            case 1: result = "열차"; break;
            case 2: result = "배"; break;
            case 3: result = "비행기"; break;
            default: result = "안탐!";
        }
        System.out.println("당신이 가고 싶은 곳인 " + result +"를 타고 가야합니다.");
        */
        //문제5
        //length == 길이 == 개수 == size
        Random r = new Random(555);
        int[] n2 = new int[1000];
        int c80 = 0, c70 = 0, c50 = 0, c0 = 0; // 여러개 변수 다 따로 초기화
        for (int i = 0; i < n2.length; i++) {
            n2[i] = r.nextInt(100) + 1;
            if (n2[i] >= 80){
                c80++;
            }else if (n2[i] >= 70){ // 70~79
                c70++;
            }else if (n2[i] >= 50){ // 50~69
                c50++;
            } else{ //49
                c0++;
            } //if
        }//for
        System.out.println(c80 + " " + c70 + " " + c50 + " " + c0);
    } //main
}// class
