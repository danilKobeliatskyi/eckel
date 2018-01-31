package com.chapter12;

public class FailingConstructor {
    Integer[] integers = new Integer[2];
    String s;
    FailingConstructor(String s) throws Exception {
        integers[0] = 0;
        integers[1] = 1;
        integers[2] = 2;
        this.s = s;
    }
    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor("hi");
        } catch(Exception e) {
            System.err.println("Caught Exception in main()");
            e.printStackTrace(System.err);
        }
    }
}
