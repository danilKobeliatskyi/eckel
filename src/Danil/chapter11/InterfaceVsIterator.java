package danil.chapter11;

import java.util.Collection;
import java.util.Iterator;

public class InterfaceVsIterator {
    public static void display(Iterator<Pet> iterator){
        while (iterator.hasNext()){
            Pet p = iterator.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
    public static void display(Collection<Pet> pets){
        for (Pet p : pets)
            System.out.print(p.id() + ":" + p + " ");
        System.out.println();
    }
}
