package org.example.day16.Interface;

public class AppleJack implements IphoneJack{

    @Override
    public void flat() { //일반 메서드
        System.out.println("흰색으로 납작하게 만들다.");
    }

    @Override
    public void making_2cm() {
        System.out.println("긴줄을 사용하여 이센티로 만들다.");
    }
}
