package danil.chapter14;

public class Triangle extends Shape {
    private boolean flag = false;
    public String toString() {
        return (flag ? "Shape" : "H") + "ighlighted " + "Triangle";
    }

    @Override
    public void rotate(Shape shape) {
        super.rotate(shape);
    }
}
