package com.chapter11;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Gerbil g = new Gerbil();
        List<Gerbil> gerbilList = new ArrayList<Gerbil>();
        gerbilList.add(new Gerbil());
        gerbilList.add(new Gerbil());
        gerbilList.add(new Gerbil());
        gerbilList.add(new Gerbil());
        gerbilList.add(new Gerbil());
        for (int i = 0; i < gerbilList.size(); i++)
            System.out.println(gerbilList.get(i));
        for (Gerbil gerbil : gerbilList)
            Gerbil.hop();

        Generator gen = new Generator();
        String[] a = new String[10];
        gen.fill1(a);
        for(String s : a) System.out.print(s + ", ");
        System.out.println();
        System.out.println(gen.fill(new ArrayList<String>(), 10));
        System.out.println(gen.fill(new LinkedList<String>(), 10));
        System.out.println(gen.fill(new HashSet<String>(), 10));
        System.out.println(gen.fill(new LinkedHashSet<String>(), 10));
        System.out.println(gen.fill(new TreeSet<String>(), 10));
    }
}
