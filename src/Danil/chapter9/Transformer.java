package danil.chapter9;

import java.nio.CharBuffer;

public class Transformer implements Readable{

    static String s = "Very important work!!!";
    private static char[] ch = s.toCharArray();

    private int count;

    public Transformer(int count){

        this.count = count;
        String result = new String(ch);
        System.out.println(result);
    }

    public int read(CharBuffer cb){
        if (count-- == 0)
            return -1;
        cb.append(ch[(ch.length)]);
        return 20;
    }
}
