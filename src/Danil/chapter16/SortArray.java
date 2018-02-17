package Danil.chapter16;

import java.util.*;


public class SortArray {
    private static Random r = new Random();
    public static void main(String[] args) {
        Integer[] ia = new Integer[10];
        for (Integer i : ia)
            i = new Integer(String.valueOf(new Random(59)));


        System.out.println(Arrays.toString(ia));
        System.out.println("sort");
        Arrays.sort(ia, Collections.reverseOrder());
        System.out.println(Arrays.toString(ia));
    }
}
