package Danil.chapter9;

public abstract class Car implements Vehicle{
    public void open(){
        System.out.println("Open left dore");
    }

    public void close(){
        System.out.println("Close left dore");
    }

    public void start(){
        System.out.println("Start engine");
    }

    public int quantity(){
        int wills = 4;
        return wills;
    }

    public void turn(){
        System.out.println("turn all wills");
    }

    public void velocity(){
        System.out.println("Velocity 210 km");
    }

    public void finish(){
        System.out.println("Stop engine");
    }
}
