package gr.aueb.cf5;

import java.util.Scanner;

public class StarsMenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            starsMenu();
            choice = scanner.nextInt();

            if (!isInputWrong(choice)) {
                System.out.println("Error you gave wrong choice");
            }
            makeChoice(choice);
        } while (choice != 6);


    }

    public static void starsMenu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("Δώσε επιλογή:");
    }

    public static boolean isInputWrong(int choice) {
        return choice >= 1 && choice <= 6;
    }

    public static void makeChoice(int choice) {
        switch (choice) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    System.out.print("*");
                }
                break;
            case 2:
                for (int i = 1; i <= 10; i++) {
                    System.out.println("*");
                }
                break;
            case 3:
                for (int i = 1; i <= 10; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 1; i <= 10; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 5:
                for (int i = 0; i <= 10; i++) {
                    for (int j = 10; j > i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                } break;
            case 6:
                System.out.println("Εξοδος");
                break;
        }
    }
}
