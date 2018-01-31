package com.chapter12;

public class ThreeLevels {
    public static void main(String[] args) {
        A a = new C();
        try {
            a.f();
        }	catch(LevelThreeException e3) {
            System.out.println("Caught e3");
        }	catch(LevelTwoException e2) {
            System.out.println("Caught e2");
        }	catch(LevelOneException e1) {
            System.out.println("Caught e1");
        }
    }
}
