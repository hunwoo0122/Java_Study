package org.example.day10.Regex;

import java.util.regex.Pattern;

public class Regex4 {
    public static void main(String[] args) {
        String pt = "^[a-zA-Z]*$";
        System.out.println(Pattern.matches(pt, "abcaa"));
        System.out.println(Pattern.matches(pt, "123"));
        System.out.println(Pattern.matches(pt, ""));
        System.out.println();
    }
}
