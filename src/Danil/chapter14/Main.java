package Danil.chapter14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Shape> shapeList = Arrays.asList(new Cycle(), new Triangle(), new Square(), new Rhomboid());
        for (Shape shape : shapeList)
            shape.draw();

        Rhomboid rhomboid = new Rhomboid();
        ((Shape)rhomboid).draw();
        //((Shape)Cycle).draw();
    }
}
