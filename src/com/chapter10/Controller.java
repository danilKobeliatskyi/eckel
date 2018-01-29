package com.chapter10;

import java.util.*;
public class Controller {
    private LinkedList<Event> eventList = new LinkedList<Event>();
    public void addEvent(Event c){
        eventList.add(c);
    }

    public void run(){
        LinkedList<Event> eventListCopy = new LinkedList<Event>(eventList);
        ListIterator<Event> iterator = eventListCopy.listIterator();
        while(iterator.hasNext()) {
            iterator.next().action();
            iterator.previous();
            System.out.println(iterator.next());
        }
    }
}
