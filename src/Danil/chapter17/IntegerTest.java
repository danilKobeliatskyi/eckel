package Danil.chapter17;

import java.util.Random;

public class IntegerTest implements Comparable<IntegerTest> {
    Random r = new Random();
    Integer i = r.nextInt(100);
    public int compareTo(IntegerTest arg) {
        int d = this.i - arg.i;
        return d < 0 ? -1 : d == 0 ? 0 : 1;
    }
    public String toString() {
        return Integer.toString(i);
    }
}
