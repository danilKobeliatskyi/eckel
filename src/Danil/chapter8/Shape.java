package Danil.chapter8;

import java.util.Iterator;
import java.util.Random;

public class Shape {
    public void draw() {}
	public void erase() {}
	public void amend() {
        System.out.println("Shape.amend()");
    }
	@Override public String toString() {
        return "Shape";
    }
}


class RandomShapeGenerator implements Iterable<Shape> {
    private Random rand = new Random();
    public Shape make() {
        switch(rand.nextInt(3)) {
            default:
                case 0: return new Circle();
                case 1: return new Square();
                case 2: return new Triangle();
        }
    }
    private Shape[] shapes;
    RandomShapeGenerator(int n) {
        shapes = new Shape[n];
        for(int i = 0; i < n; i++)
            shapes[i] = make();
        }
        public Iterator<Shape> iterator() {
            return new Iterator<Shape>() {
            private int index = 0;
            public boolean hasNext() {
                return index < shapes.length;
            }
            public Shape next() {
                return shapes[index++];
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}