package com.chapter12;

public class Resumption {
    private static int[] ints = new int[2];
    static int x = 5;

    public Resumption() {
        while (true) {
            try {
                ints[x] = 1;
                System.out.println(ints[x]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Caught ArrayIndexOutOfBoundsException");
                e.printStackTrace();
                x--;
            } finally {
                System.out.println("Are we done yet?");
            }
        }
        System.out.println("Now, we're done.");
    }
}
