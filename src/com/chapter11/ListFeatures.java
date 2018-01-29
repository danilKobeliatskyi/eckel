package com.chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListFeatures {
    public static List<Integer> listOfRandInteger(int length, int n) {
        Random rand = new Random();
        List<Integer> li = new ArrayList<Integer>();
        for (int i = 0; i < length; i++)
            li.add(rand.nextInt(n));
        return li;
    }
}
