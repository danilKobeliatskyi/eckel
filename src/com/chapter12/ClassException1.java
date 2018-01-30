package com.chapter12;

import java.util.logging.*;
import java.io.*;

public class ClassException1 extends Throwable {
    private static Logger logger = Logger.getLogger("LoggingException");
    public ClassException1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
