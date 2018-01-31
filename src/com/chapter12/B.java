package com.chapter12;

public class B extends A {
    void f() throws LevelTwoException {
        throw new LevelTwoException();
    }
}
