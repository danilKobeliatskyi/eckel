package Danil.chapter16;

public class CountingGenerator {
    public static class Double implements Generator<java.lang.Double>{
        private double value = 0.0;
        public java.lang.Double next(){
            double result = value;
            value += 1.0;
            return result;
        }
    }
}
