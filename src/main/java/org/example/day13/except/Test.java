package org.example.day13.except;

public class Test {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[5] / 0;
            //int result = numbers[2] / 0;
            //int result = numbers[2] / 1;
            System.out.println("결과: " + result);
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: 0으로 나눌 수 없습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 발생: 배열의 인덱스가 잘못되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("프로그램이 종료되었습니다.");
        }
    }
}
