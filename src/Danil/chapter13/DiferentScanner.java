package danil.chapter13;

import java.util.*;

public class DiferentScanner {
    int i;
    long L;
    float f;
    double d;
    String s;
    DiferentScanner(String s) {
        Scanner sc = new Scanner(s);
        i = sc.nextInt();
        L = sc.nextLong();
        f = sc.nextFloat();
        d = sc.nextDouble();
        this.s = sc.next();
    }
    public String toString() {
        return i + " " + L + " " + f + " " + d + " " + s;
    }
    public static void main(String[] args) {
        DiferentScanner scanner = new DiferentScanner("17 56789 2.7 3.61412 hello");
        System.out.println(scanner);
    }
}
