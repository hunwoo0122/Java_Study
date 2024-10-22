package org.example.day13.except;

public class ArrayError {
    public void array(){
        int[] arr = {1,2,3};
        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println("내가 처리함.");
        }
    }
}
//배열에러1
//-array()메서드내에서 예외처리
//배열에러처리Main1
//-array()메서드 호출

