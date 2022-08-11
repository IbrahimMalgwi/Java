package dietel.Chapter7;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        input.close();

        System.out.printf("Fibonacci(%d) = %.0f%n", n, fibonacci(n));
    }

    public static double fibonacci(int nth) {
        double fibonacciNumber = 0;

        double previous = 0;
        double current = 1;

        for (int i = 0; i < nth; i++) {
            if (i < 2) {
                fibonacciNumber = i;
            } else {
                fibonacciNumber = previous + current;
                previous = current;
                current = fibonacciNumber;
            }
        }

        return fibonacciNumber;
    }
}
