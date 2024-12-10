package gr.aueb.cf9;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * Εκτυπωνει ενα αρχειο με
 * PrintStream και
 * PrintWriter
 */

public class PrintStreamWriteApp {

    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream("c:/tmp/printStream.txt", StandardCharsets.UTF_8);
             PrintWriter pw = new PrintWriter("c:/tmp/printWriter.txt", StandardCharsets.UTF_8)) {

            ps.println("Το σέρφινγκ ή κυματοδρομία (surfing ή σερφάρισμα) \n" +
                    "είναι θαλάσσιο άθλημα στο οποίο ο αθλητής (σέρφερ) \n" +
                    "καβαλάει ένα κινούμενο κύμα. \n" +
                    "Συνήθως τα κύματα αυτά βρίσκονται στον ωκεανό, \n" +
                    "αλλά μπορεί να βρίσκονται επίσης σε λίμνες ή ποτάμια, \n" +
                    "με τη μορφή στατικών ή παλιρροιακών κυμάτων, ή να είναι τεχνητά, \n" +
                    "όπως αυτά που δημιουργούνται από πλοία ή σε ειδικές πισίνες.\n");
            pw.println("Το σέρφινγκ ή κυματοδρομία (surfing ή σερφάρισμα) \n" +
                    "είναι θαλάσσιο άθλημα στο οποίο ο αθλητής (σέρφερ) \n" +
                    "καβαλάει ένα κινούμενο κύμα. \n" +
                    "Συνήθως τα κύματα αυτά βρίσκονται στον ωκεανό, \n" +
                    "αλλά μπορεί να βρίσκονται επίσης σε λίμνες ή ποτάμια, \n" +
                    "με τη μορφή στατικών ή παλιρροιακών κυμάτων, ή να είναι τεχνητά, \n" +
                    "όπως αυτά που δημιουργούνται από πλοία ή σε ειδικές πισίνες.\n");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
