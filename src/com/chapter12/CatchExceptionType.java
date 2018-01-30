package com.chapter12;

public class CatchExceptionType {
    public static void f(int x) throws ExceptionTypeA, ExceptionTypeB, ExceptionTypeC {
        if(x < 0) throw new ExceptionTypeA("x < 0");
        if(x == 0) throw new ExceptionTypeB("x == 0");
        if(x > 0) throw new ExceptionTypeC("x > 0");
    }
    public CatchExceptionType() {
        try {
            f(0);
            f(1);
            f(-1);
        } catch(Exception e) {
            System.out.println("Caught Exception");
            e.printStackTrace(System.out);
        }
    }
}
