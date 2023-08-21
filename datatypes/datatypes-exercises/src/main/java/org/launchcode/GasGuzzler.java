package org.launchcode;

import java.util.Scanner;
public class GasGuzzler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles?");
        Double numMiles = input.nextDouble();
        System.out.println("How many gallons did you use?");
        Double numGallons = input.nextDouble();

        System.out.println("Your mpg is: " + numMiles / numGallons);
    }
}
