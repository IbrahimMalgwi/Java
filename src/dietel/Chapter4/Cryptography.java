package africa.semicolon.dietel.Chapter4;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four digit integer: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.printf("%n%d encrypted is %d%n", number, encrypt(number));

        System.out.printf("%n%d decrypted is %d%n", encrypt(number), decrypt(encrypt(number)));
    }

    /*
     * Encrypt a four-digit integer. Replace each digit with the result of adding 7
     * to the digit and getting the remainder after dividing the new value by 10.
     */
    public static int encrypt(int number) {
        int encryptedNumber = 0;

        int div = 1000;
        while (number > 0) {
            int digit = number / div;

            number = number % div;

            div /= 10;

            digit = (digit + 7) % 10;

            encryptedNumber = encryptedNumber * 10 + digit;
        }

        return swappingDigits(encryptedNumber);
    }

    /*
     * swap the first digit with the third, and swap the second digit with the
     * fourth.
     */
    private static int swappingDigits(int number) {
        int digit1 = number / 1000;
        number %= 1000;
        int digit2 = number / 100;
        number %= 100;
        int digit3 = number / 10;
        number %= 10;
        int digit4 = number;

        return digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2;
    }

    public static int decrypt(int number) {
        int decryptedNumber = 0;

        int div = 1000;
        while (number > 0) {
            int digit = number / div;

            number = number % div;

            div /= 10;

            digit = ((digit + 10) - 7) % 10;

            decryptedNumber = decryptedNumber * 10 + digit;
        }

        return swappingDigits(decryptedNumber);
    }

}
