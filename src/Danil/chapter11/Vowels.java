package Danil.chapter11;

import java.util.*;

public class Vowels {
    static void vowelCounter(Set<String> set) {
        Set<Character> vowels = new TreeSet<Character>();
        Collections.addAll(vowels,'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        int allVowels = 0;
        for(String s : set) {
            int count = 0;
            for(Character v : s.toCharArray()) {
                if(vowels.contains(v)) {
                    count++;
                    allVowels++;
                }
            }
            System.out.print(s + ": " + count + ", ");
        }
        System.out.println();
        System.out.print("Total vowels: " + allVowels);
    }
    Vowels(){
        Set<String> words = new TreeSet<String>(new TextFile("Vowels.java", "\\W+"));
        System.out.println(words);
        System.out.println();
        vowelCounter(words);
    }
    public static void main(String[] args){
        Vowels v = new Vowels();
    }
}
