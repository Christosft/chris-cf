package gr.aueb.cf9;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.UUID;

public class BinaryCopyApp {

    public static void main(String[] args) {


        File userInputFile = new File ("c:/tmp/binary.txt");
        String newOutFile = "c:/tmp/" + UUID.randomUUID().toString().replace(":", "_");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(userInputFile);
             PrintStream ps = new PrintStream(newOutFile, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s +");

                for (String token : tokens) {
                    System.out.print(token.trim() + " ");
                    ps.printf("%s ", token);
                    ps.flush();
                }
                System.out.println();
                ps.println();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}



