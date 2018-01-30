package com.chapter12;

import java.util.logging.*;
import java.io.*;

public class ClassException2 extends Throwable {
    private static Logger logger = Logger.getLogger("LoggingException");
    public ClassException2() {
        StringWriter trace = new StringWriter();
        System.out.println(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
