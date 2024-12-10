package gr.aueb.cf9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Εκτυπωνουμε στο αρχειο
 */

public class PrintStreamApp {
    public static void main(String[] args) throws FileNotFoundException {

        try (PrintStream ps = new PrintStream("c:/tmp/surfers-guide.txt", StandardCharsets.UTF_8)) {
            ps.println("Surfing Portugal is something that should be \n " +
                    "on every bucket list! With golden-sand beaches, \n " +
                    "miles of uninterrupted Atlantic coast, legendary big-wave spots, \n " +
                    "and awesome beach breaks, \n " +
                    "there’s something for everyone in this beautiful corner of Europe.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


