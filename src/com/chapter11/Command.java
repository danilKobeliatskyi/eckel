package com.chapter11;

public class Command {
    String s;

    Command(String s) {
        this.s = s;
    }

    void operation() {
        System.out.print(s);
    }
}
