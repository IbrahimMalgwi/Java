package dietel.Chapter4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        factorialB();
    }

    static void factoralA() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();

        int aux = number;

        int factorial = 1;
        while (number > 1) {
            factorial *= number;
            number--;
        }

        System.out.printf("%d! = %d", aux, factorial);
    }

    static void factorialB(){
        Scanner scanner = new Scanner(System.in);

        int numberOfTerms;

        System.out.print("Enter number of terms: ");
        numberOfTerms = scanner.nextInt();
        scanner.close();

        double result = 0;
        int termsCounter = 0;

        while (termsCounter < numberOfTerms) {

            int auxCounter = termsCounter;
            double factorial = 1;
            while (auxCounter > 1) {
                factorial *= auxCounter;
                auxCounter--;
            }

            result += 1 / factorial;

            termsCounter++;
        }

        System.out.printf("e = %f", result);
    }

    static void factorialC(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter expoent: ");
        int expoent = scanner.nextInt();

        System.out.print("Enter number of terms: ");
        int numberOfTerms = scanner.nextInt();
        scanner.close();

        double result = 1;
        int counter = 1;

        while (counter <= numberOfTerms) {
            int auxCounter = counter;
            double factorial = 1;
            while (auxCounter > 0) {
                factorial *= auxCounter;
                auxCounter--;
            }

            result += Math.pow(expoent, counter) / factorial;
            counter++;
        }

        System.out.printf("e^%d = %f", expoent, result);
    }
}
