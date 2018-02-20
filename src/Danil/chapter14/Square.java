package danil.chapter14;

public class Square extends Shape {
    private boolean flag = false;
    public String toString() {
        return (flag?"Shape" : "H") + "highlighted" + "Square";
    }

    @Override
    public void rotate(Shape shape) {
        super.rotate(shape);
    }
}
