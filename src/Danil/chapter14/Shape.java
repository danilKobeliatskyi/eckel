package Danil.chapter14;

public abstract class Shape {
    void draw(){
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}
