package Danil.chapter17;
import java.util.*;
public class ArrayAndLinkedList {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>(Arrays.asList(Countries.DATA[1]));
        List<String> linkedList = new LinkedList<String>(Arrays.asList(Countries.DATA[25]));

        System.out.print(arrayList);
        System.out.print(linkedList);
        Iterator arrayListIterator = arrayList.iterator();
        Iterator linkedListIterator = linkedList.iterator();
        while(arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next() + (arrayListIterator.hasNext() ? ", " : ""));
        }
        System.out.println();
        while(linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next() + (linkedListIterator.hasNext() ? ", " : ""));
        }
        System.out.println();
        System.out.println();
        ListIterator allit = arrayList.listIterator();
        ListIterator lllit = linkedList.listIterator();
        while(lllit.hasNext()) {
            allit.add((String)lllit.next());
            allit.next();
        }
        System.out.print(arrayList);
        System.out.println();
        List<String> al2 = new ArrayList<String>(Arrays.asList(Countries.DATA[25]));
        ListIterator allit2 = al2.listIterator();
        while(lllit.hasPrevious()) lllit.previous();
        while(allit2.hasNext()) allit2.next();
        while(lllit.hasNext()) {
            allit2.add((String)lllit.next());
            allit2.previous();
            allit2.previous();
        }
        System.out.print(al2);
    }
}
