package dietel.Chapter5;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        loop2();
    }

    static void loop1(){
        int a = 7;
        int b = 3;

        double average = (double) a / b;
        System.out.println(average);
    }
    static void loop2() {

            Scanner input = new Scanner(System.in);

            int[] numbers = new int[5];
            String[] bars = new String[5];

            for (int i = 0; i < bars.length; i++)
                bars[i] = "";

            for (int i = 0; i < numbers.length;) {
                System.out.print("Enter a number between 1 and 30: ");
                numbers[i] = input.nextInt();

                if (numbers[i] < 1 || numbers[i] > 30)
                    System.out.println(" - Error: number must is between 1-30. Try again!");
                else {
                    for (int j = 0; j < numbers[i]; j++)
                        bars[i] += "*";

                    i++;
                }
            }
            input.close();

            for (int i = 0; i < numbers.length; i++)
                System.out.printf("%02d = %s%n", numbers[i], bars[i]);
        }

        static void loop3(){
            int product = 1;

            for (int i = 1; i <= 15; i += 2)
                product *= i;

            System.out.println(product);
        }

        static void loop4(){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter number of values to input: ");
            int totalValues = scanner.nextInt();

            int smallest = 0;

            for (int i = 0; i < totalValues; i++) {
                System.out.print("Enter a integer: ");
                int number = scanner.nextInt();

                if (i == 0)
                    smallest = number;

                if (number < smallest)
                    smallest = number;
            }

            scanner.close();

            if (totalValues > 0)
                System.out.printf("%nSmallest is %d", smallest);
            else
                System.out.println("\nNo values were entered");
        }



}
