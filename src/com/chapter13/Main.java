package com.chapter13;

public class Main {
    public static void main(String[] args){
        SprinklerSystem sprinkler = new SprinklerSystem();
        sprinkler.toString();
        System.out.println(sprinkler);

        InfiniteRecursion recursion = new InfiniteRecursion();
        recursion.InfiniteRecursionAdd();
        recursion.toString();
    }
}
