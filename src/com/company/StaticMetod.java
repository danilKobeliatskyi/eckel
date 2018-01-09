package com.company;

public class StaticMetod {
    static String s1 = "at the poin";
    static String s2;
    static {
        s2 = "in a separate field";
    }
    void initializatiom(){
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Cup{
    Cup(int marcet){
        System.out.println("Cup(" + marcet +")");
    }
    void f(int marcet){
        System.out.println("f(" + marcet +")");
    }
}

class Cups{
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }
}

