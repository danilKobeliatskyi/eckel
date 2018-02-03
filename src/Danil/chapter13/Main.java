package Danil.chapter13;

public class Main {
    public static void main(String[] args){
        SprinklerSystem sprinkler = new SprinklerSystem();
        sprinkler.toString();
        System.out.println(sprinkler);

        InfiniteRecursion recursion = new InfiniteRecursion();
        recursion.InfiniteRecursionAdd();
        recursion.toString();

        PrimitiveTypes primitiveTypes1 = new PrimitiveTypes(1, 657, 5.3f, 2.7182818289);
        PrimitiveTypes primitiveTypes2 = new PrimitiveTypes(214748364, 922337203685477580L, 1.1754943508222875E-38f, 2.2250738585072014E-308);
        PrimitiveTypes primitiveTypes3 = new PrimitiveTypes(2147483647, 9223372036854775807L, 3.4028234663852886E38f, 1.7976931348623157E308);
        System.out.println(primitiveTypes1);
        System.out.println(primitiveTypes2);
        System.out.println(primitiveTypes3);
    }
}
