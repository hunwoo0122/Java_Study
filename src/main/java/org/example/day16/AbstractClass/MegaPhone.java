package org.example.day16.AbstractClass;

public interface MegaPhone extends Phone, Gps{
    void siri();
    //인터페이스는 다중상속가능
    //인터페이스 기능 중심으로 설계 -> 추상메서드만!
    //필드X
    //공유하고 싶은 상수가 있으면 가능!
    public static final String DATA = "대한민국";
}
