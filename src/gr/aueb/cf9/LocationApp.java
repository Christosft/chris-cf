package gr.aueb.cf9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class LocationApp {

    public static void main(String[] args) {
        String inFilePath = "c:/tmp/locations.txt";
        String outFilePath = "c:/tmp/locations-formatted.txt";
        String Line;
        String[] tokens;

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while ((Line = reader.readLine()) != null) {
                tokens = Line.split(", \\s*");
                printFormatted(ps, tokens);
                printFormatted(System.out, tokens);

            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void printFormatted(PrintStream ps, String[] tokens) {
        ps.printf("{ \"Location\" : \"%s\", \"Latitude\" : \"%s\", \"Longitude\" : \"%s\"}, \n", tokens[0], tokens[1], tokens[2]);
    }
}


