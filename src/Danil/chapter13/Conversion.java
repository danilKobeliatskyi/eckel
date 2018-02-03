package Danil.chapter13;

import java.math.*;
import java.util.*;

public class Conversion {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);

        char u = 'a';
        System.out.println("u = 'a'");
        f.format("s: %s\n", u);
        //f.format("d: %d\n", u);
        f.format("c: %c\n", u);
        f.format("b: %b\n", u);
        //f.format("f: %f\n", u);
        //f.format("e: %e\n", u);
        //f.format("x: %x\n", u);
        f.format("h: %h\n", u);
        System.out.println("char u = \'a\'");
        f.format("%-2s%-2S%-2c%-2C%-5b%-5B%-3h%-3H%%\n", u,u,u,u,u,u,u,u);

        int v = 121;
        System.out.println("int v = 121");
        f.format("s: %s\n", v);
        f.format("d: %d\n", v);
        f.format("c: %c\n", v);
        f.format("b: %b\n", v);
        //f.format("f: %f\n", v);
        //f.format("e: %e\n", v);
        f.format("x: %x\n", v);
        f.format("h: %h\n", v);
        f.format("%-4s%-4S%-4d%-4c%-4C%-5b%-5B%-4x%-4X%-4h%-4H%%\n", v,v,v,v,v,v,v,v,v,v,v);

        BigInteger w = new BigInteger("50000000000000");
        System.out.println("BigInteger w = 50000000000000");
        f.format("s: %s\n", w);
        f.format("d: %d\n", w);
        //f.format("c: %c\n", w);
        f.format("b: %b\n", w);
        //f.format("f: %f\n", w);
        //f.format("e: %e\n", w);
        f.format("x: %x\n", w);
        f.format("h: %h\n", w);
        f.format("%-15s%-15S%-5b%-5B%-15x%-15X%-5h%-5H%%\n", w,w,w,w,w,w,w,w);

        double x = 179.543;
        System.out.println("double x = 179.543");
        f.format("s: %s\n", x);
        //f.format("d: %d\n", x);
        //f.format("c: %c\n", x);
        f.format("b: %b\n", x);
        //f.format("f: %f\n", x);
        //f.format("e: %e\n", x);
        //f.format("x: %x\n", x);
        f.format("h: %h\n", x);
        f.format("%-8s%-8S%-5b%-5B%-15f%-15e%-15E%-12h%-12H%%\n", x,x,x,x,x,x,x,x,x);

        Conversion y = new Conversion();
        System.out.println("Conversion y = new Conversion()");
        f.format("s: %s\n", y);
        //f.format("d: %d\n", y);
        //f.format("c: %c\n", y);
        f.format("b: %b\n", y);
        //f.format("f: %f\n", y);
        //f.format("e: %e\n", y);
        //f.format("x: %x\n", y);
        f.format("h: %h\n", y);
        f.format("%-20s%-20S%-5b%-5B%-10h%-10H%%\n", y,y,y,y,y,y);

        boolean z = false;
        System.out.println("boolean z = false");
        f.format("s: %s\n", z);
        //f.format("d: %d\n", z);
        //f.format("c: %c\n", z);
        f.format("b: %b\n", z);
        //f.format("f: %f\n", z);
        //f.format("e: %e\n", z);
        //f.format("x: %x\n", z);
        f.format("h: %h\n", z);
        f.format("%-7s%-7S%-7b%-7B%-7h%-7H%%\n", z,z,z,z,z,z);
    }
}
