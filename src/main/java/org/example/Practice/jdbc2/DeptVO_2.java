package org.example.Practice.jdbc2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class DeptVO_2 {
    private int deptno;
    private String dname;
    private String loc;

//    @Override
//    public String toString() {
//        return "DeptVO_2{" +
//                "deptno=" + deptno +
//                ", dname='" + dname + '\'' +
//                ", loc='" + loc + '\'' +
//                '}';
//    }
}
