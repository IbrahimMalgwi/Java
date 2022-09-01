package dietel.Chapter6;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value for the base: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        scanner.close();

        System.out.printf("%n%d ^ %d = %d", base, exponent, integerPower(base, exponent));
    }

    public static int integerPower(int base, int exponent) {
        int result = 1;

        for (int i = 0; i < exponent; i++)
            result *= base;

        return result;
    }
}
