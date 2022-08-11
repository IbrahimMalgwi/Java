package dietel.Chapter6;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

    }

    static void evenOrOdd(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.printf("%nIs %d even? %s", number, isEven(number));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0 ? true : false;
    }

    static void multiples(){
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


