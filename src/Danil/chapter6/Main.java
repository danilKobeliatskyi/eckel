package Danil.chapter6;

public class Main {
    public static void main(String[] args){
        ProtectedMetod metod = new ProtectedMetod();
        metod.protectedMetod();

        DifferentMetods metods = new DifferentMetods();
        metods.publicMetod();
        metods.protectedMetod();
        System.out.println("Havent access to private metod");

        TestProtectedMetod test = new TestProtectedMetod();
        test.testprotectedMetod();
    }
}
