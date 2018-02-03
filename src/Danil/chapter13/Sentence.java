package Danil.chapter13;

public class Sentence {
    public static String knights = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!";
    public static String knights2 = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring.";
    static String sentence = "^[A-Z].*[\\.]$";
    public static void main(String[] args){
        System.out.println(knights.matches(sentence));
        System.out.println(knights2.matches(sentence));
    }
}
