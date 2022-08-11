package dietel.Chapter4;

import java.util.Scanner;

public class Asterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the side of a square: ");
        int sideSize = scanner.nextInt();
        scanner.close();

        int i = 0;

        while (i++ < sideSize) {
            int j = 0;

            while (j++ < sideSize)
                System.out.print("*");

            System.out.println();
        }
    }
}
