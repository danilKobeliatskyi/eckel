package danil.chapter18;
import java.io.*;
import java.util.*;


public class ReverseLines {
    public static String readAndReverse(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        LinkedList<String> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        while((s = in.readLine()) != null)
            list.add(s);
        while(list.peekLast() != null)
            sb.append(list.pollLast() + "\n");
        in.close();
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        System.out.print(readAndReverse("C:\\Users\\Danil\\IdeaProjects\\eckel\\src\\danil\\chapter18\\ReverseLines.java"));
    }
}
