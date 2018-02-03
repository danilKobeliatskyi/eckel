package Danil.chapter10;

public class Sheath {
    static class InnerClassFirstLevel{
        static class InnerClassSecondLevel{
            public static void innerSecondLevel() {
                System.out.println("Inner class in inner class");
            }
        }
    }
}
