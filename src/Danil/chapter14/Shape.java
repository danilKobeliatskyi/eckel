package danil.chapter14;

public abstract class Shape {
    void draw(){
        System.out.println(this + ".draw()");
    }
    abstract public String toString();

    public void rotate(Shape shape){
        if (shape instanceof Cycle)
            System.out.println("It makes no sense");
        else
            System.out.println(this + ".rotate");
    }
}
