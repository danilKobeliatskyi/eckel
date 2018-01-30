package com.chapter12;

public class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
        System.out.println("Exception1(String msg)");
    }
}
