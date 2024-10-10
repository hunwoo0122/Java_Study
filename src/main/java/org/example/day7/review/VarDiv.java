package org.example.day7.review;

public class VarDiv {
    int z; //전역변수는 값을 선언해도 돼고 안해도 된다. 자동초기화됨 지역변수는 자동초기화가 안됨
    public static void main(String[] args) {
        //저장공간을 만들고, 그 저장공간에 값을 넣는다.!
        //선언할 때 --> 저장공간을 만든다.
        //타입명 변수명; --> 선언!
        int x; //쓰레기값이 들어있는 상태
        // System.out.println(x);
        int y = 0; //변수만들 때 초기화를 꼭 해주세요,!
        //==> 자바에서는 선언의 위치가 이 변수가 사용될 수 있는 범위를 결정!
        //==> x, y변수는 main()메서드내에서만 사용 가능하다.!
        //==> 지역변수(local)

        for (int i = 0; i < 3; i++){
            int imsi = 0; //for문 밖에서는 사용 불가
            //imsi, i도 for문 지역내에서만 쓸 수 있음.
            //지역변수 <--> 전역변수
        }
    }
}
