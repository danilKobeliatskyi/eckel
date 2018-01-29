package com.chapter11;

import java.util.ArrayList;
import java.util.List;

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
    }
}
