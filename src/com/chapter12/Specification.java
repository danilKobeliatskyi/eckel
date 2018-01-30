package com.chapter12;

public class Specification {
    public Specification() {
        try {
            Test t = new Test();
            t.f();
        } catch(Exception1 e) {
            System.err.println("Caught Exception4");
            e.printStackTrace();
            e.showS();
        }
    }
}
