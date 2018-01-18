package com.chapter8;

public class Cycle {

    public int wills(int i){
        System.out.println(i);
        return i;
    }

    public void ride(int size){
        System.out.println("Cycle.ride()");
    }

}

class Unicycle extends Cycle{

    public void ride(int size){
        System.out.println("Unicycle.ride()");

        wills(1);
    }

}

class Bicycle extends Cycle{

    public void ride(int size){
        System.out.println("Bicycle.ride()");

        wills(2);
    }

}

class Tricycle extends Cycle{

    public void ride(int size){
        System.out.println("Tricycle.ride()");

        wills(3);
    }

}

class Rize{

    public static void rize(Cycle i){
        i.ride(10);
    }
}
