package com.chapter12;

public class Treatment {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException("From f()");
    }

    public static void main(String[] args) {
        f();
    }
}
