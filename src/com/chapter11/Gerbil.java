package com.chapter11;

import java.util.ArrayList;
import java.util.List;

public class Gerbil {
    private static int gerbilNumber;

    Gerbil(){
        gerbilNumber = 0;
    }
    public static void hop(){
        gerbilNumber ++;
        System.out.println("Gerbil number now: " + gerbilNumber);
    }
}
