package Danil.chapter14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Shape> shapeList = Arrays.asList(new Cycle(), new Triangle(), new Square(), new Rhomboid());
        for (Shape shape : shapeList)
            shape.draw();

        Rhomboid rhomboid = new Rhomboid();
        Cycle cycle = new Cycle();
        ((Shape)rhomboid).draw();

        Shape s = (Shape)cycle;
        s.draw();
        if(s instanceof Rhomboid)
            ((Rhomboid)s).draw();
        else if(!(s instanceof Rhomboid))
            System.out.println("(Shape)" + s + " is not a Rhomboid");
    }
}
