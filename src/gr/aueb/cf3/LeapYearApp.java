package gr.aueb.cf3;

import java.util.Scanner;

public class LeapYearApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = 0;

        while (true) {
            System.out.println("Δωστε ενα ετος");
            inputYear = scanner.nextInt();

            if ((inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0)) {
                System.out.println("Το ετος που δωσατε ειναι Δισεκτο: " + inputYear);
            } else {
                System.out.println("Το ετος που δωσατε δεν ειναι Δισεκτο: " + inputYear);
                System.out.println("Παρακαλω τρεξτε ξανα το προγραμμα");
                break;
            }

        }
    }
}
