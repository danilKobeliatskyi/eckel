package danil.chapter18;
import java.io.*;
import java.util.*;


public class ReverseLines {
    public static String readReverseFind(String[] sa) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(sa[0]));
        String s;
        List<String> find = new ArrayList<>();
        for(String t : sa) find.add(t);
        find.remove(0);
        LinkedList<String> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        while((s = in.readLine()) != null) {
            List<String> line = Arrays.asList(s.split("\\W+"));
            if(!(Collections.disjoint(line, find)))
                list.add(s);
        }
        while(list.peekLast() != null)
            sb.append(list.pollLast() + "\n");
        in.close();
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        if(args.length < 2) {
            System.out.println("Usage: enter file name followed by words to find in lines of that file");
            System.exit(1);
        }
        System.out.print(readReverseFind(args));
    }
}
