package gr.aueb.cf9;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Απλη PrintStream μεθοδος
 */

public class PrintStreamMethod {

    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("c:/tmp/codingFactory.txt", StandardCharsets.UTF_8);

        printMsg(ps, "Hello Coding Factory");
        printMsg(System.out, "Hello Coding Factory");

    }

    public static void printMsg(PrintStream ps, String message) {
        ps.println(message);
    }
}

