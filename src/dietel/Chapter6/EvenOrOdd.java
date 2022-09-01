package dietel.Chapter6;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.printf("%nIs %d even? %s", number, isEven(number));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0 ? true : false;
    }
}
