package org.example.day13.inherit2;

public class UseThread {
    public static void main(String[] args) {
        //스레드 사용 3가지 단계
        //1. 스레드 상속받아 클래스 정의
        //2. 1에서 만든 스레드클래스 객체생성
        //3. 실행대기줄에 등록
        CounterThread c = new CounterThread();
        VisuableThread t = new VisuableThread();
        ArrayThread a = new ArrayThread();

        c.start();
        t.start();
        a.start();
    }
}
