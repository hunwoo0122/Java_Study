package org.example.day15.Collection;

import java.util.HashMap;
import java.util.Map;

public class Q2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "김데이");
        map.put(200, "김사전");
        map.put(300, "김구조");
        map.put(400, "김자료");

        // 특정 고객 정보 업데이트
        map.remove(200);
        map.put(300, "김충성");

        System.out.println(map);

        // 전체 고객 리스트 출력
        System.out.println("고객의 전체 리스트:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("고객 번호: " + entry.getKey() + ", 이름: " + entry.getValue());
        }
    }
}
