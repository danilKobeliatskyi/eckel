package com.Chapter10;

public class Sequence {

    private Object[] items;
    private int next = 0;

    public Sequence(){

        SelectorString s = new SelectorString();
        s.toString("Here");
        SelectorString sel = new SelectorString();
        sel.toString("You mast");
        SelectorString select = new SelectorString();
        select.toString("Write something");
    }

    public Sequence(int size){

        items = new Object[size];
    }

    public void add(Object x){

        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {

        private int i = 0;

        public boolean end() {

            return i == items.length;
        }

        public Object current() {

            return items[i];
        }

        public void next() {

            if (i < items.length)
                i++;
        }

    }
        public Selector selector(){

            return new SequenceSelector();
        }

}
