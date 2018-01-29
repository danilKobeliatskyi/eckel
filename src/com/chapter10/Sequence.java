package com.chapter10;

public class Sequence {
    private Object[] items;
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
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    public Selector reverseSelector() {
        return new Selector() {
            @Override
            public boolean end() {
                return i == items.length;
            }

            @Override
            public Object current() {
                return items[i];
            }

            @Override
            public void next() {
                if (i < items.length)
                    i++;
            }

            public Sequence out() {
                return Sequence.this;
            }
        };
    }
}