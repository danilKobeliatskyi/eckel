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
        for (Gerbil gerbil : gerbilList)
            Gerbil.hop();
    }
}
