package com.company;

public class Main {

    static final String S = "World";

    public static void cookingMetod(int i, char l) {System.out.println("woter: " + i + ", liters:" + 'l');}
    public static void cookingMetod(char l, int i) {System.out.println("liters:" + 'l'+ ", woter" + i);}

    private int a;
        Main Temp(){
            System.out.println("Good");
            return this;
        }
        void result() {
            Main s = new Main();
            s.Temp();
            this.Temp();
        }

    public static void main(String[] args) {

        Home x = new Home();
        x.printLodgerCount();

        Test t = new Test();
        Test t2 = new Test(S);

        Main text =new Main();
        text.result();

        Dog d = new Dog();
        d.TestConst();
        d.TestChar();
        d.TestByte();
        d.TestShort();
        d.TestInt();
        d.TestLong();
        d.TestFloat();
        d.TestDouble();

        cookingMetod(2, 'l');
        cookingMetod('l', 2);

        WitoutConstructor w = new WitoutConstructor();
        w.text();

        MetodFinalize f = new MetodFinalize();
        f.finalize();
    }
}
