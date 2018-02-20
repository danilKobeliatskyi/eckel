package danil.chapter8;

public class Polygon extends Shape {
    @Override public void draw() {
        System.out.println("Polygon.draw()");
    }
	@Override public void erase() {
        System.out.println("Polygon.erase()");
    }
	@Override public void amend() {
        System.out.println("Polygon.amend()");
    }
	@Override public String toString() {
        return "Triangle";
    }
}
