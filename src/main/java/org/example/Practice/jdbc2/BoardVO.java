package org.example.Practice.jdbc2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardVO {
    private int no;
    private String title;
    private String content;
    private String writer;

//    @Override
//    public String toString() {
//        return "BoardVO{" +
//                "no=" + no +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                ", writer='" + writer + '\'' +
//                '}';
//    }
}

