package danil.chapter18;
import java.util.*;
import java.io.*;

import static danil.chapter18.BinaryFile.read;

public class ByteCounter {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Danil\\IdeaProjects\\eckel\\src\\danil\\chapter18\\ByteCounter.java";
        try {
            byte[] ba = read(fileName);
            Set<Byte> byteSet = new TreeSet<Byte>();
            for(Byte b : ba) byteSet.add(b);
            List<Byte> byteList = new ArrayList<Byte>();
            for(byte b : ba) byteList.add(b);
            Map<Byte,Integer> byteMap = new HashMap<Byte,Integer>();
            for(Byte b : byteSet) {
                int count = 0;
                for(Byte d : byteList) {
                    if(d.equals(b)) count++;
                }
                byteMap.put(b, count);
            }
            System.out.println();
            System.out.println(byteMap);
        } catch(IOException e) {
            System.err.println("Caught " + e);
        }
    }
}
