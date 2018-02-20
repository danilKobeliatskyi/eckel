package danil.chapter14;

public class Cycle extends Shape {
    boolean flag = false;

    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted " + "Circle";
    }

    @Override
    public void rotate(Shape shape) {
        super.rotate(shape);
    }
}
