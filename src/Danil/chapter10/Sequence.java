package Danil.chapter10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Sequence {
    private Collection<Object> collection = new ArrayList<Object>();
    private int next = 0;
    private int i = 0;

    public Sequence() {
        SelectorString s = new SelectorString();
        s.toString("Here");
        SelectorString sel = new SelectorString();
        sel.toString("You mast");
        SelectorString select = new SelectorString();
        select.toString("Write something");
    }

    public Sequence(int size) {
        collection = new ArrayList<Object>();
    }

    public Iterator iterator(){
        return collection.iterator();
    }

    public void add(Object x) {
            collection.add(x);
    }

    public Selector reverseSelector() {
        return new Selector() {
            @Override
            public boolean end() {
                return i == collection.size();
            }

            @Override
            public Object current() {
                return collection;
            }

            @Override
            public void next() {
                if (i < collection.size())
                    i++;
            }

            public Sequence out() {
                return Sequence.this;
            }
        };
    }
}