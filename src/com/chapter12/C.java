package com.chapter12;

public class C extends B {
    void f() throws LevelThreeException {
        throw new LevelThreeException();
    }
}
