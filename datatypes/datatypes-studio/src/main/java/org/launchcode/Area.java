package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");
        Double radius = input.nextDouble();
//        System.out.println("The area of a circle of radius " + radius + " is: " + 3.14 * radius * radius);
        System.out.println(org.launchcode.Circle.getArea(radius));
    }
}