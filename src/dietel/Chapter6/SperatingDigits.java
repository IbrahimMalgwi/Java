package dietel.Chapter6;

import java.util.Scanner;

public class SperatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        do {
            System.out.print("Enter a number between 1 and 99999: ");
            number = input.nextInt();
        } while (number < 1 || number > 99999);
        input.close();

        displayDigits(number);
    }

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int rem(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int number) {
        String result = "";

        while (number != 0) {
            int rem = rem(number, 10);
            number = quotient(number, 10);
            result = rem + "  " + result;
        }

        System.out.println(result);
    }
}
