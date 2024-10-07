package org.example.day4.array;

public class ArrayCompete {
    public static void main(String[] args) {
        String[] title = {"국어", "수학", "영어", "컴퓨터", "음악"};
        int[] n1 = {44, 66, 77, 22, 11}; //1학기 점수
        int[] n2 = {33, 55, 77, 22, 40}; //2학기 점수
        //1. 1학기, 2학기 동일한 점수인 과목수, 동일하지 않은 점수인 과목수
        int cnt = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        for(int i=0; i<title.length; i++){
            if(n1[i] == n2[i]){
                cnt++;
            }else{
                cnt2++;
            }
        }
        System.out.println("동일한 점수인 과목수는 " + cnt +" 동일하지 않은 점수인 과목수는 " + cnt2);
        //2. 2학기에 성적이 오른 과목수
        for(int i=0; i<title.length; i++){
            if(n1[i] < n2[i]){
                cnt3++;
                System.out.println("2학기에 성적이 오른 과목수는 " + cnt3 +"개");
            }
        }
        //3. 2학기에 성적이 오른 과목명
        for(int i=0; i<title.length; i++){
            if(n1[i] < n2[i]){
                String obj = title[i];
                System.out.println("2학기에 성적이 오른 과목명은 " + obj);
            }
        }
    }
}
