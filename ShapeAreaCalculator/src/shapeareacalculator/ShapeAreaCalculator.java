package shapeareacalculator;

import java.util.Scanner;

/**
 *
 * @author yusufhassim
 */
public class ShapeAreaCalculator {

    // Method to calculate rectangle area
    static double rectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate square area
    static double squareArea(double side) {
        return side * side;
    }

    // Method to calculate circle area
    static double circleArea(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter rectangle length: ");
        double length = input.nextDouble();
        System.out.print("Enter rectangle width: ");
        double width = input.nextDouble();
        System.out.println("Rectangle area: " + rectangleArea(length, width));

        // Square
        System.out.print("Enter square side: ");
        double side = input.nextDouble();
        System.out.println("Square area: " + squareArea(side));

        // Circle
        System.out.print("Enter circle radius: ");
        double radius = input.nextDouble();
        System.out.println("Circle area: " + circleArea(radius));

        input.close();
    }
}
