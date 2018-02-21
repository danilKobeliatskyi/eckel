package danil.chapter18;

import java.io.*;

public class InOut {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Danil\\IdeaProjects\\eckel\\src\\danil\\chapter18\\InOut.java");
        BufferedInputStream inFile =
                new BufferedInputStream(new
                        FileInputStream(file));
        System.setIn(inFile);
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        String s;
        while((s = stdin.readLine()) != null)
            System.out.println(s.toUpperCase());
    }
}
