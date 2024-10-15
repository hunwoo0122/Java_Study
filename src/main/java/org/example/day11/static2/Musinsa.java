package org.example.day11.static2;

import java.util.ArrayList;
import java.util.List;

class 옷 {
    String name;
    String brand;
    String size;
    int price;
    static int totalPrice;
    static int totalCount;
    double 별점;
    static double 모든별점;
    List<String> 리뷰 = new ArrayList<>();
    static List<String> 모든리뷰 = new ArrayList<>();
    public 옷(String name, String brand, String size, int price, double 별점) {
        totalCount++;
        totalPrice += price;
        모든별점 += 별점;
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.별점 = 별점;
    }
    public void 리뷰등록(String content) {
        리뷰.add(content);
        모든리뷰.add(content);
    }
    public void 리뷰출력() {
        System.out.println(this.name + 리뷰);
    }
    public static void 평균별점() {
        System.out.println(모든별점 / totalCount);
    }
    public static void 모든리뷰출력() {
        System.out.println(모든리뷰);
    }
}
class 상의 extends 옷 {
    public 상의(String name, String brand, String size, int price, double 별점) {
        super(name, brand, size, price, 별점);
    }
}
class 하의 extends 옷 {
    public 하의(String name, String brand, String size, int price, double 별점) {
        super(name, brand, size, price, 별점);
    }
}
class Musinsa {
    public static void main(String[] args) {
        옷 스웻셔츠 = new 상의("스웻셔츠", "캘빈클라인 진", "XL", 50460, 4.6);
        스웻셔츠.리뷰등록("아빠 선물로 사드렸는데 디자인도 깔끔하고 무난하게 예뻐요");
        스웻셔츠.리뷰등록("재질 색깔 사이즈 모두 무난합니다 다만 기모가 많이 빠져여");
        스웻셔츠.리뷰출력();
        옷 중국인바지 = new 하의("치노팬츠", "시그니처", "L", 39900, 4.7);
        중국인바지.리뷰등록("바디프로필 촬영을 위해 구매했는데 여름 느낌 물신나고 스타일리쉬해서 평소에도 흰티에 자주 입을꺼같아요.");
        중국인바지.리뷰등록("색감이 좀 더 진하고 기장이 짧아요 근데 오히려 좋아");
        중국인바지.리뷰출력();
        옷.모든리뷰출력();
        옷.평균별점();
    }
}