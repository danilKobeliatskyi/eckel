package danil.chapter16;

import java.util.*;

public class MyList  extends ArrayList {
    List myList = new ArrayList();
    MyList(List l) { myList = l; }
    @SuppressWarnings("unchecked")
    MyList getReversed() {
        ListIterator lit = myList.listIterator(myList.size());
        List reverseMyList = new ArrayList();
        while(lit.hasPrevious()) {
            reverseMyList.add(lit.previous());
        }
        return new MyList(reverseMyList);
    }
}
