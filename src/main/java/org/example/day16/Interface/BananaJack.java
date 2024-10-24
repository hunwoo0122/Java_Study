package org.example.day16.Interface;

public class BananaJack implements IphoneJack{
    //표준역할을 하는 인터페이스가 있는 경우 인터페이스를 안쓰면 안되나?
    //써야하는 이유!
    @Override
    public void flat() {
        System.out.println("검정색으로 납작하게 만들다.");
    }

    @Override
    public void making_2cm() {
        System.out.println("짧은 줄로 이센치를 만들다.");
    }
    //
}
