package dietel.Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesCommision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> salaries = new ArrayList<>();

        int grossSales = 0;

        while (grossSales != -1) {
            System.out.print("Gross sales in the week or -1 to quit: ");
            grossSales = scanner.nextInt();

            if (grossSales != -1)
                salaries.add((int) (200 + (0.09 * grossSales)));
        }
        scanner.close();

        displayRanges(salaries);
    }

    public static void displayRanges(ArrayList<Integer> salaries) {
        System.out.println("\nFrequency of wages at each of the following intervals:");
        int[] frequency = new int[11];

        for (Integer salary : salaries) {
            int rangeIndex = salary / 100;
            ++frequency[rangeIndex > 10 ? 10 : rangeIndex];
        }

        for (int i = 2; i < frequency.length; i++) {
            /*
             * 1. $200–299 2. $300–399
             */

            if (i == 10)
                System.out.printf("$%d %s: ", 1000, "and over");
            else
                System.out.printf("$%d-%d: ", i * 100, i * 100 + 99);

            for (int starts = 0; starts < frequency[i]; starts++)
                System.out.print("*");

            System.out.println();
        }
    }

}
