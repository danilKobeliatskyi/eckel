package com.chapter11;

import java.util.ArrayList;
import java.util.List;

public class ListNum {
    ListNum(){
        Number[] n = new Number[10];
        for(int i = 0; i < n.length; i++)
            n[i] = new Number();
        List<Number> lt = new ArrayList<Number>();
        for(Number x : n) lt.add(x);
        System.out.println("list of Number: " + lt);
        List<Number> sub = lt.subList(2, 6);
        System.out.println("subList: " + sub);
        List<Number> copy = new ArrayList<Number>(lt);
        copy.removeAll(sub);
        System.out.println("copy: " + copy);
        lt = copy;
        System.out.println("list of Number: " + lt);
    }
}
