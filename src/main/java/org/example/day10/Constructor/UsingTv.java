package org.example.day10.Constructor;

public class UsingTv {
    public static void main(String[] args) {
        TV myTV = new TV(7, 9, true);
        TV yourTV = new TV(9, 12, true); // 스택 2개(myTV, yourTV)
        // 메모리 힙영역에 6개 저장(7, 9, true, 9, 12, true)
        System.out.println(myTV);
        System.out.println(yourTV);
    }
}
