package org.launchcode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius = 0d;
        do {
            System.out.println("Enter a radius:");
            try {
                radius = input.nextDouble();
            }
            catch(InputMismatchException e) {
                System.out.println("That is not a valid number!");
                System.exit(1);
            }
        }
        while (radius < 0);


        System.out.println(org.launchcode.Circle.getArea(radius));
    }
}
