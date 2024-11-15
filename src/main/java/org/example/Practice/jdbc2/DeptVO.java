package org.example.Practice.jdbc2;

public class DeptVO {
    private int deptno;
    private String dname;
    private String loc;

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    public String getDname() {
        return dname;
    }
    public void setLoc(String loc) {
        this.loc = loc;
    }
    public String getLoc() {
        return loc;
    }
}
