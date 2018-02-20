package Danil.chapter17;

import java.util.*;

public class Unsupported {
    static void test(String msg, List<String> list) {
        System.out.println("--- " + msg + " ---");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1,8);
        Collection<String> c2 = new ArrayList<String>(subList);
        try { c.retainAll(c2); } catch(Exception e) {
            System.out.println("retainAll(): " + e);
        }
        try { c.removeAll(c2); } catch(Exception e) {
            System.out.println("removeAll(): " + e);
        }
        try { c.clear(); } catch(Exception e) {
            System.out.println("clear(): " + e);
        }
        try { c.add("X"); } catch(Exception e) {
            System.out.println("add(): " + e);
        }
        try { c.addAll(c2); } catch(Exception e) {
            System.out.println("addAll(): " + e);
        }
        try { c.remove("C"); } catch(Exception e) {
            System.out.println("remove(): " + e);
        }
        try {
            list.set(0, "X");
        } catch(Exception e) {
            System.out.println("List.set(): " + e);
        }
        try { list.add(0, "X"); } catch(Exception e) {
            System.out.println("List.add(): " + e);
        }
        try { list.addAll(0, c2); } catch(Exception e) {
            System.out.println("List.addAll(): " + e);
        }
        try { list.remove(0); } catch(Exception e) {
            System.out.println("List.remove(): " + e);
        }
        try { list.removeAll(c2); } catch(Exception e) {
            System.out.println("List.removeAll(): " + e);
        }
        try { list.retainAll(c2); } catch(Exception e) {
            System.out.println("List.retainAll(): " + e);
        }
    }
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("Modifiabe Copy", new ArrayList<String>(list));
        test("Arrays.asList()", list);
        test("unmodifiableLlist()",
                Collections.unmodifiableList(new ArrayList<String>(list)));
    }
}
