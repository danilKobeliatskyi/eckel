package danil.chapter18;
import java.io.*;
import java.util.*;


public class ReverseLines {
    public static String readAndReverse(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        LinkedList<String> list = new LinkedList<String>();
        StringBuilder sb = new StringBuilder();
        while((s = in.readLine()) != null)
            list.add(s.toUpperCase());
        while(list.peekLast() != null)
            sb.append(list.pollLast() + "\n");
        in.close();
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        if(args.length != 1) {
            System.out.println("Usage: enter file name");
            System.exit(1);
        }
        System.out.print(readAndReverse(args[0]));
    }
}
