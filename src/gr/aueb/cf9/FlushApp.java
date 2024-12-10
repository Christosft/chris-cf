package gr.aueb.cf9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FlushApp {

    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream("c:/tmp/flush.txt")) {
            Scanner in = new Scanner(System.in);
            ps.println("Το σέρφινγκ ή κυματοδρομία (surfing ή σερφάρισμα) \n" +
                    "είναι θαλάσσιο άθλημα στο οποίο ο αθλητής (σέρφερ) \n" +
                    "καβαλάει ένα κινούμενο κύμα. \n" +
                    "Συνήθως τα κύματα αυτά βρίσκονται στον ωκεανό, \n" +
                    "αλλά μπορεί να βρίσκονται επίσης σε λίμνες ή ποτάμια, \n" +
                    "με τη μορφή στατικών ή παλιρροιακών κυμάτων, ή να είναι τεχνητά, \n" +
                    "όπως αυτά που δημιουργούνται από πλοία ή σε ειδικές πισίνες.\n");
            ps.flush();
            System.out.println("Please insert to continue: ");
            in.nextInt();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
