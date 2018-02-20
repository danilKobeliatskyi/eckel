package danil.chapter12;

public class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }
    void Dispose() {
        System.out.println("Erasing circle");
        super.dispose();
    }
}
