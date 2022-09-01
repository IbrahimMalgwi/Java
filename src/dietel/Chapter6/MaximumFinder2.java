package dietel.Chapter6;

import java.util.Scanner;

public class MaximumFinder2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Three values seperated by space: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double maximum = Math.max(number1, Math.max(number2, number3));

        System.out.println("Maximum number is " + maximum);
    }
}
