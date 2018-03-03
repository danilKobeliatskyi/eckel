package danil.chapter18;

import java.util.regex.*;
import java.nio.*;
import java.nio.channels.*;
import java.io.*;
import java.nio.charset.*;

public class JGrep {
    public static void main(String[] args) throws Exception {
        if(args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        FileChannel fc = new FileInputStream(args[0]).getChannel();
        MappedByteBuffer in = fc.map(FileChannel.MapMode.READ_ONLY, 0, new File(args[0]).length());
        String[] sa = Charset.forName(System.getProperty("file.encoding")).decode(in).toString().split("\n");
        Pattern p = Pattern.compile(args[1]);
        Matcher m = p.matcher("");
        int index = 0;
        for(String line : sa) {
            m.reset(line);
            while(m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
        }
        fc.close();
    }
}
