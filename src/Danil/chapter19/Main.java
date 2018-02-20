package Danil.chapter19;

public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        for(int i = 0; i < 7; i++) {
            System.out.println(light);
            light.change();
        }
    }
}
