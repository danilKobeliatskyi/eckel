package com.chapter8;

import java.util.Random;

public class Shape {

    public void draw(){}

    public void ears(){}

    public void word(){
        System.out.println("This is shape");
    }

}

class Circle extends Shape {

    public void draw(){
        System.out.println("Circle draw");
    }

    public void ears(){
        System.out.println("Circle ears");
    }

    public void word(){
        System.out.println("This is circle");
    }

}

class Square extends Shape {

    public void draw(){
        System.out.println("Square draw");
    }

    public void ears(){
        System.out.println("Square ears");
    }

    public void word(){
        System.out.println("This is square");
    }

}
class Triangle extends Shape {

    public void draw(){
        System.out.println("Triangle draw");
    }

    public void ears(){
        System.out.println("Triangle ears");
    }

    public void word(){
        System.out.println("This is triangle");
    }

}

class Polygon extends Shape {

    public void draw(){
        System.out.println("Polygon draw");
    }

    public void ears(){
        System.out.println("Poligon ears");
    }

    public void word(){
        System.out.println("This is poligon");
    }

}

class RandomShapeGenerator{

    private Random rand =new Random(6);

    public Shape next(){

        switch (rand.nextInt(16)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 3: return new Triangle();
            case 4: return new Polygon();
        }
    }
}

//class Shapes