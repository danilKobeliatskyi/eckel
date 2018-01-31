package com.chapter12;

public class Disposable {
    private static int counter = 0;
    private int id = counter++;
    private boolean disposed;
    Disposable() {
        disposed = false;
    }
    void dispose() {
        disposed = true;
    }
    String checkStatus() {
        return (id + " " + (disposed ? "disposed" : "not disposed"));
    }
}
