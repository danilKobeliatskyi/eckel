package danil.chapter13;

import java.util.*;

public class InfiniteRecursion {
    public String toString() {
        return " InfiniteRecursion address: " + super.toString() + "\n";
    }
    public void InfiniteRecursionAdd() {
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for(int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }
}
