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

public class Circle {
    private String color;
    private double radius;
    private final double PI = 3.14159;

    // default 
    public Circle() {
        radius = 1.0;
        color = "white";
    }

    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double findArea() {
        double circleArea = PI * (radius * radius);
        return circleArea;
    }

    public double findCircumference() {
        double circumference = 2 * PI * radius;
        return circumference;
    }

    public double findSurfaceArea() {
        double surfaceArea = 4 * PI * (radius * radius);
        return surfaceArea;
    }

    public double findVolume() {
        double diameter = radius * 2;
        double vol = (PI * (diameter * diameter * diameter)) / 6;
        return vol;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        DecimalFormat df = new DecimalFormat ("#,###,###.000");
        //sb.append("\nCircle ");
        sb.append("\nColor: " + getColor());
        sb.append("\nRadius: " + getRadius());
        sb.append("\nArea: " + df.format (findArea()));
        sb.append("\nCircumference: " + df.format (findCircumference()));
        sb.append("\nSurface Area: " + df.format (findSurfaceArea()));
        sb.append("\nVolume: " + df.format (findVolume()));
        
        return sb.toString();
    }
} // end class Circle
