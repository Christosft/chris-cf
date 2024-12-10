package gr.aueb.cf4;

/**
 * Αναπτύξτε πέντε προγράμματα αντίστοιχα με τα
 * προηγούμενα όπου ο χρήστης θα δίνει το πλήθος
 * των stars, έστω n
 * – n οριζόντια αστεράκια,
 * – n κάθετα,
 * – nxn,
 * – από 1 έως n,
 * – από n έως 1
 */

public class Stars {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <= 20; i++) {
            System.out.println("*");
        }
        for (int i = 1; i <= 20; i++) {
           for ( int j = 1; j <= 20; j++){
               System.out.print("*");
           }
            System.out.println();
        }
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 20; i++) {
            for (int j = 20; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
