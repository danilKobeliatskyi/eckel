package danil.chapter18;
import java.io.*;
import java.util.*;


public class ReverseLines {
    public static String readAndReverse(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        LinkedList<String> list = new LinkedList<String>();
        StringBuilder sb = new StringBuilder();
        String[] temp = filename.split("\\.");
        String file = temp[0] + "Reversed." + temp[1];
        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        while((s = in.readLine()) != null)
            list.add(lineCount++ + " " + s);
        while(list.peekLast() != null) {
            String t = list.pollLast();
            out.println(t);
            sb.append(t + "\n");
        }
        in.close();
        out.close();
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        if(args.length != 1) {
            System.out.println("Usage: enter file name");
            System.exit(1);
        }
        System.out.println(readAndReverse(args[0]));
    }
}
