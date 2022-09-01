package dietel.Chapter6;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPrime(number))
            System.out.printf("%n%d is prime", number);
        else
            System.out.printf("%n%d is not prime", number);
    }

    public static boolean isPrime(int number) {
        if (number < 2)
            return false;

        if (number % 2 == 0 && number > 2)
            return false;

        int root = (int) Math.sqrt(number);

        for (int i = 2; i <= root; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
