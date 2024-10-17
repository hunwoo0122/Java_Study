package org.example.day12.debugger;
public class Main3 {
    public static void main(String [] args) {
        System. out.println("첫 번째 함수 호출");
        double result1 = firstFunction(3, 4);
        System. out.println("두 번째 함수 호출");
        double result2 = secondFunction(7, 2);
        System. out.println(result1 + ", " + result2);


        //실행시 메서드 코드를 보고 싶은 경우
        //메서드 이름위에 컨트롤 + 클릭
    }
    public static int firstFunction( int a, int b) {
        int sum = a + b;
        System.out.println("첫 번째 함수 결과: " + sum);
        return sum;
    }
    public static int secondFunction( int x, int y) {
        int product = x * y;
        System.out.println("두 번째 함수 결과: " + product);
        return product;
    }
}