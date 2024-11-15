package org.example.Practice.jdbc2;

public class TestLombok3 {
    public static void main(String[] args) {
        DeptVO_2 vo =  new DeptVO_2();

        vo.setDeptno(1);
        vo.setDname("Park");
        vo.setLoc("Seoul");

        int depthno = vo.getDeptno();
        String dname = vo.getDname();
        String loc = vo.getLoc();
        System.out.println(depthno + " " + dname + " " + loc);
        System.out.println(vo);
    }
}

