package Danil.chapter9;

public class BicycleFactory implements CycleFactory {

    public Cycle getCycle(){

        return new Bicycle();
    }
}
