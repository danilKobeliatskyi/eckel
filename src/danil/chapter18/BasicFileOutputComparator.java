package danil.chapter18;
import java.io.*;

public class BasicFileOutputComparator {
    static String file = "BasicFileOutputComparator.out";
    static String file2 = "BasicFileOutputComparator2.out";
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(BufferedInputFile.read("C:\\Users\\Danil\\IdeaProjects\\eckel\\src\\danil\\chapter18\\\\BasicFileOutputComparator.java")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        long start = System.nanoTime();
        while((s = in.readLine()) != null )
            out.println(lineCount++ + ": " + s);
        long duration = System.nanoTime() - start;
        out.close();
        System.out.println("Buffered write:   " + duration + " nanoseconds");
        BufferedReader in2 = new BufferedReader(new StringReader(BufferedInputFile.read("C:\\Users\\Danil\\IdeaProjects\\eckel\\src\\danil\\chapter18\\\\BasicFileOutputComparator.java")));
        PrintWriter out2 = new PrintWriter(new FileWriter(file2));
        int lineCount2 = 1;
        String s2;
        long start2 = System.nanoTime();
        while((s2 = in2.readLine()) != null )
            out2.println(lineCount2++ + ": " + s2);
        long duration2 = System.nanoTime() - start2;
        out2.close();
        System.out.println("Unbuffered write: " + duration2 + " nanoseconds");
        System.out.println("file: " + BufferedInputFile.read(file));
        System.out.println("file2: " + BufferedInputFile.read(file2));
    }
}
