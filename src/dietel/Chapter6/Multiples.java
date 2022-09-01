package dietel.Chapter6;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter another integer: ");
        int number2 = scanner.nextInt();
        scanner.close();

        System.out.printf("%n%d is a multiple of %d? %s", number2, number1, isMultiple(number1, number2));
    }

    public static boolean isMultiple(int number1, int number2) {
        return number2 % number1 == 0 ? true : false;
    }
}
