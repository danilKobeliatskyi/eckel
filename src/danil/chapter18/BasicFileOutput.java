package danil.chapter18;
import java.io.*;

public class BasicFileOutput {
    static String file = "BasicFileOutput.out";
    public static void main(String[] args) throws IOException {
        LineNumberReader in = new LineNumberReader(new FileReader("C:\\Users\\Danil\\IdeaProjects\\eckel\\src\\danil\\chapter18\\BasicFileOutput.java"));
        PrintWriter out = new PrintWriter(file);
        String s;
        while((s = in.readLine()) != null )
            out.println(in.getLineNumber() + ": " + s);
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
