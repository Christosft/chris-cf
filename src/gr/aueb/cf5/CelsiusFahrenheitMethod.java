package gr.aueb.cf5;

/**
 * We want to turn the celsius temp
 * to fahrenheit using the formula celsius * 9/5 + 32
 */

import java.util.Scanner;

public class CelsiusFahrenheitMethod {

    public static void main(String[] args) {


        System.out.println("The temp in fahrenheit is: " + celsiusToFahrenheitGr ());
    }
    public static double celsiusToFahrenheitGr  () {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        System.out.println("Please give celsius temp");
        celsius = scanner.nextDouble();
        return ((celsius * 9) / 5) + 32;

    }
}
