package fummi;

import java.util.Scanner;

public class PalindromeNumbers {


    public static void palindrome(){
        Scanner scanner = new Scanner(System.in);

        int userNumber = 0;

        while (userNumber < 20000) {
            System.out.print("Enter a five-digit integer: ");
            userNumber = scanner.nextInt();

            if (userNumber < 20000)
                System.err.println("\nInvalid number. Try again.\n");
        }
        scanner.close();

        int number = userNumber;

        int reverseNumber = 0;

        while (number > 0) {
            int rem = number % 10;
            number /= 10;
            reverseNumber = reverseNumber * 10 + rem;
        }

        if (userNumber == reverseNumber)
            System.out.printf("%n%d is palindrome", userNumber);
        else
            System.out.printf("%n%d is not palindrome", userNumber);
    }
    public static void main(String[] args) {
        palindrome();
    }
}
