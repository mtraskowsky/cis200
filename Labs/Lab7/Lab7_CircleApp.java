/*
* Lab7.java
* <Maria Traskowsky / Lab Section A / 2:30-4:20>
*
* This program calculates and displays the color, radius, area, circumference,
* surface area, and volume for a circle. The program also takes user input for the
* second circle and calculates and displays the same values mentioned above. 
*
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        Circle [] circleArray = new Circle[2];

        circleArray[0] = new Circle();
        int i = 0;
        System.out.println("Circle " + (i + 1) + ":");
        System.out.println("Color: " + circleArray[0].getColor());
        System.out.println("Radius: " + circleArray[0].getRadius());
        System.out.printf("Area: %.3f", circleArray[0].findArea());
        System.out.printf("\nCircumference: %.3f", circleArray[0].findCircumference());
        System.out.printf("\nSurface Area: %.3f", circleArray[0].findSurfaceArea());
        System.out.printf("\nVolume: %.3f", circleArray[0].findVolume());
        System.out.println();
        System.out.println();

        
        System.out.println("Circle 1: " + circleArray[0].toString());
        System.out.println();

        Scanner s = new Scanner (System.in);

        System.out.println("Enter in the radius of Circle 2: ");
        double radius2 = Double.parseDouble(s.nextLine());
        System.out.println("Enter in the color of Circle 2: ");
        String color2 = s.nextLine();
        System.out.println();

        circleArray[1] = new Circle(radius2, color2);

        System.out.println("Circle 2: " + circleArray[1].toString());

    } // end main

} // end class CircleApp
