package org.example.day10.Regex;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex1 {
    public static void main(String[] args) {
        String pt = "^[a-zA-Z]*$";
        System.out.println(Pattern.matches(pt, "abcaa"));
        System.out.println(Pattern.matches(pt, "123"));
        System.out.println(Pattern.matches(pt, ""));
        System.out.println();

        Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
        Matcher result1 = pattern.matcher("abcaa");
        System.out.println(result1);
        System.out.println(result1.find());
    }
}
