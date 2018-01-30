package com.chapter12;

import java.util.logging.*;
import java.io.*;

public class ExceptionGenerator {
    private static int[] ints = new int[2];
    private static Logger logger = Logger.getLogger("ExceptionGenerator Exceptions");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public ExceptionGenerator() {
        try {
            ints[2] = 3;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException");
            e.printStackTrace();
            logException(e);
        }
    }
}
