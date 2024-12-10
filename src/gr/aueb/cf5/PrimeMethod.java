package gr.aueb.cf5;

import java.util.Scanner;

public class PrimeMethod {

    public static void main(String[] args) {

        System.out.println("The number you gave is Prime: " + isPrime());
    }
    public static boolean isPrime () {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        System.out.println("Please give a number: ");
        inputNum = scanner.nextInt();
        if (inputNum <= 1) {
            return  false;
        }
        for (int i = 2; i <= Math.sqrt(inputNum); i ++) {
            if (inputNum % i == 0) {
                return false;
            }

        } return true;
    }
}
