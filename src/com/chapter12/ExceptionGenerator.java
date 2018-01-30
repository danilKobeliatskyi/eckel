package com.chapter12;

public class ExceptionGenerator {
    private static int[] ints = new int[2];
    public ExceptionGenerator() {
        try {
            ints[2] = 3;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println(
                    "Caught ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        }
    }
}
