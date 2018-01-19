package com.chapter8;

public class RectangularGlyph extends RoundGlyph {

    private int radius = 1;

    RectangularGlyph(int r){

        super(r);
        radius = r;
        System.out.println("RectangularGlyph.RectangularGlyph(), radius = " + radius);
    }

    void draw(){
        System.out.println("RectangularGlyph.draw() radius = " + radius);
    }
}
