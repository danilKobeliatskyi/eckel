package Danil.chapter17;

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
    }
}
