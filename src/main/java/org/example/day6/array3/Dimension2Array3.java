package org.example.day6.array3;

import javax.swing.*;

public class Dimension2Array3 {
    public static void main(String[] args) {
        //전체 프레임이 필요
        //new를 이용해서 부품을 만들어 램에 넣어둠.
        // 램에 넣어놨으면 일단 변수에 저장하자
        JFrame f = new JFrame();
        //1. new Jframe(): 램에 넣어둔 주소를 변수에 저장
        //2. f = new JFrame(): 램에 넣어둔 주소를 변수에 저장
        //3. JFrame f: f라는 변수에는 JFrame이 들어있는 주소를 넣어두었다.
        // --> 이렇게 쓰면 f에는 JFrame이 저장된 위치만 넣을 수 있고,
        //     다른 부품의 위치는 넣을 수 없음.
        System.out.println(f);
        f.setSize(300, 300);
        String[] title = {"장소", "누구와", "언제"};
        String[][] contents = {
                {"여의도","혼자","오후 3시"},
                {"부산","친구","오후 4시"},
                {"강릉","혼자","오후 5시"}
        };
        //JTable table = new JTable(2차원 배열 데이터 , 1차원의 항목명);
        JTable table = new JTable(contents , title);
        JScrollPane pane = new JScrollPane(table);
        f.add(pane);
        //맨 끝에!!
        f.setVisible(true); //보이는 것 설정
    }
}
