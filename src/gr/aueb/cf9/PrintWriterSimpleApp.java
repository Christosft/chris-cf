package gr.aueb.cf9;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * Απλη PrintWriter μεθοδος
 */

public class PrintWriterSimpleApp {

    public static void main(String[] args) {

        try ( PrintWriter pw = new PrintWriter("c:/tmp/printWriterMethod.txt", StandardCharsets.UTF_8)) {
            pw.println("Learning coding is perfect");
            

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
