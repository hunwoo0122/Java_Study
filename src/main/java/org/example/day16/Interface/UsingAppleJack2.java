package org.example.day16.Interface;

public class UsingAppleJack2 {
    public static void main(String[] args) {
        IphoneJack a = new BananaJack(); // <- 실무에서 많이 쓰이는 코드 (쓰임새가 무수히 다양하기 때문)
        //인터페이스를 먼저 설정하고 프로젝트를 하는경우도 있음 회사마다 인터페이스를 쓰는곳도 안쓴느 곳도 있음
        //국책사업같은 프로젝트경우 인터페이스를 사용함
        a.flat();
        a.making_2cm();

    }
}
