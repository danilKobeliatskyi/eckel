package danil.chapter17;

import java.util.TreeSet;

public class AlphabeticSort {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        RandomGenerator.String rgs = new RandomGenerator.String(5);
        for(int i = 0; i < 20; i++) {
            ts.add(rgs.next());
        }
        System.out.print(ts);
    }
}
