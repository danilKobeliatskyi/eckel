package Danil.chapter11;

import java.util.*;

public class ClassWithIteratorForCollection {
    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
    LinkedList<Character> linkedList = new LinkedList<Character>(Arrays.asList('a', 'b', 'c'));
    HashSet<Float> hashSet = new HashSet<Float>(Arrays.asList(4.4f, 5.5f, 6.6f));
    TreeSet<Double> treeSet = new TreeSet<Double>(Arrays.asList(7.77, 8.88, 9.99));
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(Arrays.asList(123, 456, 789));

    ClassWithIteratorForCollection(){
        printArray(arrayList);
        printArray(linkedList);
        printArray(hashSet);
        printArray(treeSet);
        printArray(linkedHashSet);
    }

    public static void printArray(Collection c) {
        Iterator iterator = c.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
    }
}
