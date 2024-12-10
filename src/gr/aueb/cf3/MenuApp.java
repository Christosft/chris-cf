package gr.aueb.cf3;

import java.util.Scanner;

/**
 * Δημιουργησαμε ενα μενου με 5 επιλογες και δινωντας
 * ο χρηστης εναν αριθμο απο το 0 εως το 5
 * εμφανιζεται το αντιστοιχο μυνημα.
 */

public class MenuApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNum = 0;


        do {
            System.out.println("Παρακαλω δωστε μια επιλογη");
            System.out.println("1.Εισαγωγη");
            System.out.println("2.Διαγραφη");
            System.out.println("3.Ενημερωση");
            System.out.println("4.Αναζητηση");
            System.out.println("5.Εξοδος");
            inputNum = scanner.nextInt();

            if (inputNum == 0) {
                System.out.println("Δωσατε λαθος επιλογη");
                break;

            } else if (inputNum == 1) {
                System.out.println("Επιλεξατε εισαγωγη");

            } else if (inputNum == 2) {
                System.out.println("Επιλεξατε Διαγραφη");

            } else if (inputNum == 3) {
                System.out.println("Επιλεξατε ενημερωση");

            } else if (inputNum == 4) {
                System.out.println("Επιλεξατε αναζητηση");

            } else if (inputNum == 5) {
                System.out.println("Επιλεξατε εξοδος");

            }
        } while (inputNum != 5);
        {
            System.out.println("Βγηκατε απο το Μενου");
        }
    }
}
