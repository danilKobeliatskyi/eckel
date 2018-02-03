package Danil.chapter11;

import java.util.*;

public class Gerbil {
    private static int gerbilNumber;

    Gerbil(int i) {
        gerbilNumber = i;
        }
    public static void hop(){
        gerbilNumber ++;
        System.out.println("Gerbil number now: " + gerbilNumber);
    }
}
