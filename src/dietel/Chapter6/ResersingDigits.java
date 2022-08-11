package dietel.Chapter6;

import java.util.Scanner;

public class ResersingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int value = input.nextInt();
        input.close();

        System.out.println(reverse(value));
    }

    public static int reverse(int value) {
        int reverted = 0;

        while (value != 0) {
            int rem = value % 10;
            value /= 10;
            reverted = rem + 10 * reverted;
        }

        return reverted;
    }
}
