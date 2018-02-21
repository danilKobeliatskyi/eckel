package danil.chapter18;
import java.io.*;
import java.text.*;
import java.util.*;

public class ModifiedAfter {
    public static void main(final String[] args) {
        if(args.length != 2) {
            System.out.println("Usage: directory date(02/20/2018)");
            System.out.println("(Outputs a listing of all java files in the given directory that were last modified on or after the given date.)");
            return;
        }
        final SimpleDateFormat sdf = new SimpleDateFormat("02/20/2018");
        new ProcessFiles(new ProcessFiles.Strategy() {
            public void process(File file) {
                Date modDate = new Date(file.lastModified());
                try {
                    if(modDate.after(sdf.parse(args[1])))
                        System.out.println(file);
                } catch(ParseException e) {
                    System.out.println(e.getMessage());
                }
            }
        }, "java").start(args);
    }
}
