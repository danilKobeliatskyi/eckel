package com.chapter12;

public class Frog extends Amphibian{
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");

    public Frog() {
        System.out.println("Frog17()");
    }

    public static void jump() {
        System.out.println("frog jumps");
    }

    protected void dispose() {
        System.out.println("Frog17 dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        try {
            frog.jump();
            System.out.println("Returning from try-finally");
            return;
        } finally {
            System.out.println("Bye!");
            frog.dispose();
        }
    }
}
