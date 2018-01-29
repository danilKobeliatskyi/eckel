package com.chapter11;

import java.util.LinkedList;
import java.util.ListIterator;

public class ConteinerLincedList {
    static void addMiddle(LinkedList<Integer> link, Integer[] list) {

        for(Integer i : list) {
            ListIterator<Integer> it =
                    link.listIterator((link.size())/2);
            it.add(i);
            System.out.println(link);
        }
    }
    ConteinerLincedList(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Integer[] x = {0, 1, 2, 3, 4, 5, 6, 7};
        ConteinerLincedList.addMiddle(linkedList, x);
    }
}
