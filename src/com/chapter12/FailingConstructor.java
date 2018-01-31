package com.chapter12;

import java.io.*;

public class FailingConstructor {
    private BufferedReader in;
    public FailingConstructor(String name) throws Exception {
        try {
            in = new BufferedReader(new FileReader(name));
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file " + name);
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("in.close() failed");
            }
            throw e;
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch(IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch(IOException e2) {
            throw new RuntimeException("in.close() failed");
        }
    }

    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor("AlwaysFinally.java");
            try {
                String s;
                int i = 1;
                while((s = failingConstructor.getLine()) != null) {
                }
            } catch(Exception e) {
                System.out.println("Exception caught in main()");
                e.printStackTrace(System.err);
            } finally {
                failingConstructor.dispose();
            }
        } catch(Exception e) {
            System.out.println("FailingConstructor construction failed");
        }
    }
}
