package danil.chapter13;

public class Replacing {
    public static String knights = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!";
    public static void main(String[] args) {
        System.out.println(knights.replaceAll("[AEIOUaeiou]", "_"));
    }
}
