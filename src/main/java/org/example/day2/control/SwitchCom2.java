package org.example.day2.control;

public class SwitchCom2 {
    public static void main(String[] args) {
        int month = 3;
        // 계절판별
        switch (month) {
            case 1:
                System.out.println("봄입니다.");
                break;
            case 2:
                System.out.println("여름입니다.");
                break;
            case 3:
                System.out.println("가을입니다.");
                break;
            default:
                System.out.println("겨울입니다.");
                break;
        }

        String food = "감자탕";
        switch (food) {
            case "짬뽕":
                System.out.println("중국집으로");
                break;
            case "우동":
                System.out.println("분식집으로");
                break;
            case "감자탕":
                System.out.println("한식으로");
                break;
            default:
                System.out.println("집에서 먹자");
                break;


        }
    }
}
