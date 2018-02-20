package danil.chapter19;

public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        for(int i = 0; i < 7; i++) {
            System.out.println(light);
            light.change();
        }

        System.out.println("\n");

        CartoonCharacter cc = CartoonCharacter.BOB;
            for(int i = 0; i < 10; i++) {
                System.out.print(cc.next());
                System.out.print((i < 9) ? ", " : "");
            }
    }
}
