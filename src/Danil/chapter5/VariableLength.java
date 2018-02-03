package Danil.chapter5;

public class VariableLength {
    public static void variableLength(String...args){
        for (String s : args)
            System.out.println(" " + s);
        System.out.println();
    }
    public static void f(String[] args){
        variableLength("first", "second", "third");
        variableLength((String[]) new String[]{"first", "second", "third"});
    }
}
