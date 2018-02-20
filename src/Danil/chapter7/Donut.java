package danil.chapter7;

class Cake {
    int parametr(int length){
        System.out.println("parametr(int)");
        System.out.println("Have lenght " + length + "sm");
        return length;
    }
    double parametr(double radius){
        System.out.println("parametr(double)");
        System.out.println("Have radius " + radius + "sm");
        return radius;
    }
    String parametr(String color){
        System.out.println("parametr(String)");
        System.out.println("Have " + color + " color");
        return color;
    }
}

public class Donut extends Cake{
    Donut(){
        System.out.println("This donut:");
    }

    boolean parametr(boolean yami){
        System.out.println("parametr(boolean)");
        if (yami == true)
            System.out.println("Delicious");
        else System.out.println("Not tasty");
        return yami;
    }
}