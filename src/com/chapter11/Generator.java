package com.chapter11;

import java.util.Collection;

public class Generator {
    int key = 0;
    public String next() {
        switch(key) {
            default:
            case 0 : key++; return "Frodo Bagins";
            case 1 : key++; return "Sherlock";
            case 2 : key++; return "Rango";
            case 3 : key++; return "Bambi";
            case 4 : key++; return "Pumba";
            case 5 : key++; return "Happy Potter";
            case 6 : key++; return "Ronald";
            case 7 : key = 0; return "Lucifer";
        }
    }
    public void fill1(String[] a) {
        for(int i = 0; i < a.length; i++)
            a[i] = next();
    }
    public Collection fill(Collection<String> c, int n) {
        for(int i = 0; i < n; i++)
            c.add(next());
        return c;
    }
}
