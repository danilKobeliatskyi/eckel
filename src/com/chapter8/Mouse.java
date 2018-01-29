package com.chapter8;

public class Mouse extends Rodent{

    private Characteristic characteristic;
    private static long counter = 0;
    private final long id = counter++;

    Mouse(Characteristic characteristic){
        super(characteristic);
        System.out.println("Mouse" + id);
        this.characteristic = characteristic;
        this.characteristic.addRef();
    }

    protected void eat() {
        System.out.println("Mouse eat");
    }

    protected void dispose(){
    System.out.println("coat white or grey");
    characteristic.dispose();
    }
}
