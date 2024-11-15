package org.example.Practice.jdbc2;

public class TestLombok2 {
    public static void main(String[] args) {
        //1. 가방을 만들자
        BoardVO vo = new BoardVO();
        //2. 가방에 데이터를 넣자
        vo.setNo(1);
        vo.setTitle("신발");
        vo.setContent("부츠");
        vo.setWriter("Son");
        //3. 가방을 전달하자.
        //4. 가방을 데이터를 꺼내자
        int no = vo.getNo();
        String title = vo.getTitle();
        String content = vo.getContent();
        String writer = vo.getWriter();
        System.out.println(no + " " + title + " " + content + " " + writer);
        System.out.println(vo);
    }
}

