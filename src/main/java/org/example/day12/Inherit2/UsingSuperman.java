package org.example.day12.Inherit2;
import java.lang.String;
public class UsingSuperman {
    public static void main(String[] args) {
        Superman s = new Superman("클라크 켄트", 30, 100, true);
        s.eat();
        s.run();
        s.space();
        System.out.println(s.toString());
    }
}
