package com.chapter12;

public class TryInTry {
    static void f() {
        try {
            try {
                g();
            } catch(ExceptionF ge) {
                System.out.println("Caught ExceptionF in f inner try");
                ge.printStackTrace();
                throw new ExceptionH("from f(), inner try");
            }
        } catch(ExceptionH he) {
            System.out.println("Caught ExceptionH in f() outer try");
            he.printStackTrace(System.out);
        }
    }
    static void g() throws ExceptionF {
        throw new ExceptionF("from g()");
    }
    public TryInTry() {
        f();
    }
}
