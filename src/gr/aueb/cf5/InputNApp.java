package gr.aueb.cf5;

import java.util.Scanner;

public class InputNApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputN;
        int inputX = 1;
        int sum =0;

        System.out.println("Please give a number");
        inputN = in.nextInt();

        while (inputX <= inputN) {
            System.out.println(inputX);  // Εκτύπωση του αριθμού
            sum += inputX;               // Προσθήκη του αριθμού στο άθροισμα
            inputX++;                    // Αύξηση του μετρητή
        }

        // Εκτύπωση του αθροίσματος
        System.out.println("Το άθροισμα είναι: " + sum);

        }


    }

