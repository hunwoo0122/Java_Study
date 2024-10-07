package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayPattern {
    public static void main(String[] args) {
        //1. 배열을 만들어서 나중에 반복문으로 데이터 많이 넣기
        int[] jumsu = new int[5]; // 많은 데이터를 샘플링 할때
        Random r = new Random(100); // 아무값이나 만들어주는 부품 시드값은 일정하게 랜덤한 값들을 일정하게 해줌
        for (int i = 0; i < jumsu.length; i++) {
            // String num = JOptionPane.showInputDialog("숫자입력"); // string입력이라 sout에 반영이 안된다.
            // jumsu[i] = Integer.parseInt(num);
            jumsu[i] = r.nextInt(100); // -21억~21억 0~99 bound값은 값의 범위를 설정
        }
        System.out.println(Arrays.toString(jumsu));
        //2. 배열에 있는 값을 꺼내어 누적
        int sum = 0; //누적하는 변수는 반복문내에 넣지 않음
        for(int x : jumsu){
            sum = sum + x;
            //앞의 sum: 새값까지 누적된 값
            //뒤의 sum: 이전까지 더해진 값
        }
        System.out.println(sum);
        //3. 배열에 있는 값을 반복해서 처리하는데 조건이 있는 경우
        int sum2 = 0;
        for (int x : jumsu) {
            if(x >= 80){
                sum2 = sum2 + x; // sum += x;
            }
        }
        //코드정리(코드 포맷팅) 컨트롤 + 알트 + L
        System.out.println(sum2);
        //4. 배열에 있는 값을 가지고 위치를 찾는 경우 <-- 실무에서는 많이 쓰이지 않지만 코테에서 많이 쓰임
        for(int i = 0; i < jumsu.length; i++) {
            if(jumsu[i] == 88){
                //88이 하나인 경우
                System.out.println("88찾음.");
                System.out.println(i + 1 + "번째에 있음.");
                break; // 반복문의 break!
            }
        }
    }
}
