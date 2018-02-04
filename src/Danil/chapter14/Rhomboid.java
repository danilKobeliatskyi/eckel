package Danil.chapter14;

public class Rhomboid extends Shape {
    private boolean flag = false;
    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted " + "Rhomboid";
    }

    @Override
    public void rotate(Shape shape) {
        super.rotate(shape);
    }
}
