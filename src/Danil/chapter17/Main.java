package Danil.chapter17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        SList<String> sl = new SList<String>();
        System.out.println(sl);
        SListIterator<String> slIter = sl.iterator();
        System.out.println("inserting \"hi\"");
        slIter.insert("hi");
        System.out.println(sl);
        System.out.println("inserting \"there\"");
        slIter.insert("there");
        System.out.println(sl);
        System.out.println("inserting \"sweetie\"");
        slIter.insert("sweetie");
        System.out.println(sl);
        System.out.println("inserting \"pie\"");
        slIter.insert("pie");
        System.out.println(sl);
        SListIterator<String> slIter2 = sl.iterator();
        System.out.println("removing \"hi\"");
        slIter2.remove();
        System.out.println(sl);
        System.out.println("inserting \"hello\"");
        slIter2.insert("hello");
        System.out.println(sl);
        System.out.println("removing \"there\"");
        slIter2.remove();
        System.out.println(sl);
        System.out.println("removing \"sweetie\"");
        slIter2.remove();
        System.out.println(sl);
        System.out.println("removing \"pie\"");
        slIter2.remove();
        System.out.println(sl);
        System.out.println("removing \"hello\"");
        SListIterator slIter3 = sl.iterator();
        slIter3.remove();
        System.out.println(sl);

        SortedSet<T> ss = new SortedSet<T>();
        ss.add(new T());
        ss.add(new T());
        ss.add(new T());
        ss.add(new T());
        System.out.print(ss);
        SortedSet<Integer> ss2 = new SortedSet<Integer>();
        ss2.add(6);
        ss2.add(8);
        ss2.add(2);
        ss2.add(4);
        ss2.add(2);
        ss2.add(8);
        System.out.print(ss2);
        SortedSet<String> ss3 = new SortedSet<String>();
        ss3.add("three");
        ss3.add("three");
        ss3.add("seven");
        ss3.add("hi");
        ss3.add("two");
        ss3.add("one");
        System.out.print(ss3);

        AssociativeArray<String, String> map = new AssociativeArray<>(6);
        map.put("Sky", "blue");
        map.put("Grass", "green");
        map.put("Ocean", "dancing");
        map.put("Tree", "tall");
        map.put("Ears", "brown");
        map.put("Sun", "warm");

        try {
            map.put("extra", "object");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println(map);
        System.out.println(map.get("ocean"));

        HashMap<String,String> hashMap = new HashMap<String,String>(6);
        hashMap.put("sky", "blue");
        hashMap.put("grass", "green");
        hashMap.put("ocean", "dancing");
        hashMap.put("tree", "tall");
        hashMap.put("earth", "brown");
        hashMap.put("sun", "warm");
        try {
            hashMap.put("extra", "object");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println(hashMap);
        System.out.println(hashMap.get("ocean"));

        TreeMap<String,String> treeMap = new TreeMap<String,String>();
        treeMap.put("sky", "blue");
        treeMap.put("grass", "green");
        treeMap.put("ocean", "dancing");
        treeMap.put("tree", "tall");
        treeMap.put("earth", "brown");
        treeMap.put("sun", "warm");
        try {
            treeMap.put("extra", "object");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println(treeMap);
        System.out.println(treeMap.get("ocean"));

        LinkedHashMap<String,String> linkedHashMap =
                new LinkedHashMap<String,String>(6);
        linkedHashMap.put("sky", "blue");
        linkedHashMap.put("grass", "green");
        linkedHashMap.put("ocean", "dancing");
        linkedHashMap.put("tree", "tall");
        linkedHashMap.put("earth", "brown");
        linkedHashMap.put("sun", "warm");
        try {
            linkedHashMap.put("extra", "object"); // Too far
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get("ocean"));
    }
}
