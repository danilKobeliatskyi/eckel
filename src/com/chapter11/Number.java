package com.chapter11;

public class Number {
    public static int counter = 0;
    private int id = counter++;
    public String toString() {
        return String.valueOf(id);
    }
}