package com.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIterator {
    ListIterator() {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4));
            List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9));
            java.util.ListIterator<Integer> iterator1 = list1.listIterator();
            java.util.ListIterator<Integer> iterator2 = list2.listIterator();
            System.out.println("li1: " + list1);
            System.out.println("li2: " + list2);
            while (iterator1.hasNext()) {
                iterator1.next();
            }
            while (iterator2.hasNext()) {
                iterator2.next();
                iterator2.set(iterator1.previous());
            }
            System.out.println("list1: " + list1);
            System.out.println("list2: " + list2);
    }
}