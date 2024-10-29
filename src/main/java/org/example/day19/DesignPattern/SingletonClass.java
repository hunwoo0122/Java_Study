package org.example.day19.DesignPattern;

public class SingletonClass {
    private static SingletonClass single; //null --> 주소로 변환!
    //객체를 하나만 만들어서 사용하는 것.
    //생성된 하나의 객체를 싱글톤 객체. <--> 프로토타입
    //외부에서 객체생성을 못하게 막아야 함.
    //new 싱글톤클래스(); //객체생성시 생성자메서드를 반드시 호출하게 되는데,
    //                   ==> 생성자메서드를 외부에서 호출을 못하게 막아버리면 됨.
    private SingletonClass(){
        System.out.println("객체 생성됨.!!");
    }

    public static SingletonClass getInstance(){
        if (single == null){
            single = new SingletonClass();
        }
        return single;
        //return 생성된싱글톤객체주소;
    }

    @Override
    public String toString() {
        return single.hashCode() + "";
    }
}