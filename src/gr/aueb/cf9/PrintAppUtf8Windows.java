package gr.aueb.cf9;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * Prints files using
 * UTF-8 and Windows-1252
 */


public class PrintAppUtf8Windows {

    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("c:/tmp/printStreamUtf8.txt", StandardCharsets.UTF_8);
        PrintWriter pw = new PrintWriter("c:/tmp/printWriterWin1252.txt", "Windows-1252");

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

            ps.close();
            pw.close();

        }
    }
