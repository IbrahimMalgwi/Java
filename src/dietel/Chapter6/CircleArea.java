package dietel.Chapter6;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        double radius = scanner.nextDouble();

        System.out.printf("Circle area is %,.2f cm²", circleArea(radius));
        scanner.close();
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
