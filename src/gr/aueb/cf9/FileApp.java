package gr.aueb.cf9;

import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {
        File fa = new File("C:/tmp/file6.txt");
        File faOut = new File("c:/tmp/file6-out.txt");

        try (Scanner in = new Scanner(fa);
             PrintStream sa = new PrintStream(faOut, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] tokens = line.split("//s");

                for (String token : tokens) {
                    System.out.printf("%s", token.trim() + " ");
                    sa.printf("%s\n ",  token);
                    sa.flush();
                }

                System.out.println();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}