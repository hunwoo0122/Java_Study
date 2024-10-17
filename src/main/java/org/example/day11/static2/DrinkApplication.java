package org.example.day11.static2;

import java.util.Scanner;

public class DrinkApplication {
    private static Drink[] drinks = {
            new Drink("콜라", 1200, 10),
            new Drink("사이다", 1100, 10),
            new Drink("커피", 900, 10)
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("자판기 메뉴");
            System.out.println("1. 음료 보기");
            System.out.println("2. 음료 구매");
            System.out.println("3. 종료");
            System.out.print("선택: ");
            int choice = sc.nextInt();
            if(choice == 1) {
                System.out.println("음료 목록:");
                for (int i = 0; i < drinks.length; i++){
                    System.out.println((i + 1) + "." +drinks[i].name + "(가격: " + drinks[i].price +"원, 재고: " + drinks[i].stock +"개)");
                }
            } else if (choice == 2) {
                for (int i = 0; i < drinks.length; i++){
                    System.out.println((i + 1) + "." +drinks[i].name + "(가격: " + drinks[i].price +"원, 재고: " + drinks[i].stock +"개)");
                }
                System.out.print("구매할 음료 번호를 선택하세요: ");
                int choice2 = sc.nextInt();
                System.out.println(drinks[choice2-1].name +"를 구매했습니다.");
                drinks[choice2-1].stock--;
            } else{
                System.out.println("자판기를 종료합니다.");
                break;
            }
        }
        sc.close();
    }
}
class Drink{
    String name;
    int price;
    int stock;
    public Drink(String name, int price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
