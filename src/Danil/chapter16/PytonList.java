package danil.chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PytonList {
    public static void main(String[] args) {
        List<Integer> aList =
                new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(aList);
        System.out.println(aList.get(4));
        aList.add(new Integer(6));
        aList.addAll(new ArrayList<Integer>(Arrays.asList(7,8)));
        System.out.println(aList);
        System.out.println(aList.subList(2,4));
        MyList ml = new MyList(aList);
        System.out.println((ml.getReversed()).myList);
    }
}
