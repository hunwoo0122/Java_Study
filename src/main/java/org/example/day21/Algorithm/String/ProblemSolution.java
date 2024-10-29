package org.example.day21.Algorithm.String;

import java.util.ArrayList;
import java.util.Arrays;

public class ProblemSolution {
    public static void main(String[] args) {
        //1. String s = "감,배,위"; 각 글자를 추출 후(split())
        //   오름차순으로 정렬하여 String에 넣어 프린트
        System.out.println("----첫번째 문제-----");
        String s = "감,배,위";
        String[] arr = s.split(",");
        Arrays.sort(arr);
        String result = String.join(" ", arr);
        System.out.println(result);

        //2. String[] s2 = {"제주도", "부산", "울릉도"};
        //   다음과 같이 출력되도록 하나의 String으로 묶어서 프린트
        //   나는 제주도 가고 싶다. 나는 부산 가고 싶다. 나는 울릉도 가고 싶다.
        System.out.println("----두번째 문제-----");
        String[] s2 = {"제주도", "부산", "을릉도"};
        for (int i = 0; i < s2.length; i++) {
            System.out.println("나는 " + s2[i] + " 가고 싶다.");
        }

        //3. String[] s3 = {"제주도", "부산", "울릉도"};
        //   s3 목록에 "울산", "파주", "인천"추가 후, 첫번째 위치에 있는 것 삭제
        //   부산을 마산으로 변경후 하나의 String으로 묶어서 프린트
        System.out.println("-------세번째 문제------");
        String[] s3 = {"제주도", "부산", "을릉도"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s3));

        list.add("울산");
        list.add("파주");
        list.add("인천");

        list.remove(0);

        //"부산"을 "마산"으로 변경
        int index = list.indexOf("부산");
        if (index != -1) {
            list.set(index, "마산");
        }

        // ArrayList를 하나의 문자열로 묶어서 출력
        String result2 = String.join(", ", list);
        System.out.println(result2);

        //4. String s4 = "마사아차가나"; 오름차순으로 정렬 후 프린트
        System.out.println("-------네번째 문제-------");
        String s4 ="마사아차가나";

        char[] chars = s4.toCharArray();

        // 오름차순 정렬
        Arrays.sort(chars);
        // 정렬된 문자 배열을 문자열로 변환
        String sortedString = new String(chars);
        System.out.println(sortedString);

        //5. int[] s5 = {55, 100, 77, 88, 22}를 정렬 후
        // 역순으로 int[] s6에 옮겨 프린트
        System.out.println("-------다섯번째 문제--------");
        int[] s5 = {55, 100, 77, 88, 22};
        Arrays.sort(s5);

        int[] s6 = new int[s5.length];

        for (int i = 0; i < s5.length; i++) {
            s6[i] = s5[s5.length -1 - i];
        }

        System.out.println(Arrays.toString(s6));
    }
}
