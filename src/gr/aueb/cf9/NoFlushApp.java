package gr.aueb.cf9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class NoFlushApp {

    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream("c:/tmp/no-flush.txt")) {
            ps.println("Hello Chris");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
