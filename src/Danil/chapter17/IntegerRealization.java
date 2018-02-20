package danil.chapter17;

import java.util.PriorityQueue;

public class IntegerRealization {
    public static void main(String[] args) {
        PriorityQueue<IntegerTest> pt =
                new PriorityQueue<IntegerTest>();
        for(int i = 0; i < 20; i++) {
            pt.add(new IntegerTest());
        }
        int size = pt.size();
        for(int i = 0; i < size; i++) {
            System.out.print(pt.poll() + " ");
        }
    }
}
