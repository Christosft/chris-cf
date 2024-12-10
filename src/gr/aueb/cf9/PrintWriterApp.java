package gr.aueb.cf9;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Εφαρμογή που διαβάζει με
 * Scanner και γράφει με
 * printWriter
 */

public class PrintWriterApp {
    public static void main(String[] args) {
        File faIn = new File("c:/tmp/file8.txt");
        File faOut = new File("c:/tmp/file8-out.txt");

        try (Scanner in = new Scanner(faIn);
             PrintWriter sa = new PrintWriter(faOut, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] tokens = line.split("//s");

                for (String token : tokens) {
                    System.out.printf("%s", token.trim() + " ");
                    sa.printf("%s ",  token);
                    sa.flush();
                }

                sa.println();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

