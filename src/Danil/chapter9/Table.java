package Danil.chapter9;

public class Table extends Furniture {

    public void legs(){

        System.out.println("there are 4 legs");
    }

    static void from(){

        Furniture object1 = new Table();
        object1.legs();
    }
}
