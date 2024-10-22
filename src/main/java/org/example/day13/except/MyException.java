package org.example.day13.except;

public class MyException extends Exception {
    //Exception의 message필드

    public MyException(String message) {
        super(message);
    }
}