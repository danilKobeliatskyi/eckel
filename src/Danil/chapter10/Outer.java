package Danil.chapter10;

public class Outer {

    private static String s;

    static class Inner{

        public void inner(){

            System.out.println("Class Inner");
        }

        public String toString(){

            System.out.println(s);
            return s;
        }

        Inner(){

            inner();
        }
    }

    Outer(){

        s = "Private string in class Outer";
    }

    public Inner content(){

        return new Inner();
    }
}
