package danil.chapter17;

import danil.chapter13.TextFile;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class WordCounter {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Danil\\IdeaProjects\\eckel\\src\\danil\\chapter17\\WordCounter.java";
        Set<String> words = new TreeSet<String>(new TextFile(fileName, "\\W+"));
        AssociativeArray<String,Integer> wordCount = new AssociativeArray<String,Integer>(words.size());
        ArrayList<String> fileList = new TextFile(fileName, "\\W+");

        for(String s : words) {
            int count = 0;
            for(String t : fileList) {
                if(t.equals(s)) count++;
            }
            wordCount.put(s, count);
        }
        System.out.print(wordCount);
    }
}
