package Excersises;

import java.util.Scanner;

public class NumberTriangle2 {

    public static void main(String[] args) {
        int rows;
        int number1 = 1;
        int counter1 = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = input.nextInt();

        while (counter1 <= rows){
            int number2 = 0;
            int counter2 = 1;

        while (counter2 <= counter1)
            System.out.printf("%d", number1 + number2);

            number2 ++;
            counter2 ++;
            counter1 ++;
        }
        System.out.println();

    }

    public static class Lane {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter your Speed: ");
            double speed = input.nextDouble();

            System.out.print("Enter acceleration: ");
            double acceleration = input.nextDouble();

            double runWay = (speed * speed) / (2 * acceleration);

            System.out.printf("Run way length for this plane is : %.3 f", runWay);

        }

    }

    public static class Kilogram {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter your weight in pounds: ");
            double pounds = input.nextDouble();

            double kilograms = pounds * 0.454;

            System.out.printf("Your weight in kilograms is: %f", kilograms);

        }
    }
}
