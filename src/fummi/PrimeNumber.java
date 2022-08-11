package fummi;

import java.util.Scanner;

public class PrimeNumber {
    public static void primeNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        if (number == 2) {
            System.out.println(number + "is a prime number");
        }

        if (number > 2) {

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is is not a prime number");
                    break;
                }
                if (i == number - 1) {
                    System.out.println(number + " is a prime number");
                }
            }
        }
    }
    public static boolean isPrimeNumber(int number){
        if (number == 2) {
            return true;
        }

        if (number > 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
                if (i == number - 1) {
                    return true;
                }
            }
        } return false;
    }

    public static void isPrime(int number){
        if (number == 2) {
            System.out.println(number + "is a prime number");
        }

        if (number > 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    continue;
                }
                if (i == number - 1) {
                    System.out.println(number + "is a prime number");
                }
            }
        }
    }

    public static void main(String[] args) {
        int i = 1;
        int countOfPrimeNumber = 0;

        while (i <= 10_000){
            boolean result = isPrimeNumber(i);
            if (result){
                System.out.println(i);
                countOfPrimeNumber++;
            }
            i++;
        }
        System.out.println("There are " + countOfPrimeNumber+ " Prime numbers between 1 to 10,000" );
    }
}
