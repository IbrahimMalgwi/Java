/* Question 2.32 An application that accept five numbers and determine
the positive numbers, the nagative numbers and zeros */

import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int number1 = input.nextInt();

		if(number1 + number1 == 0) {
			System.out.println("Number 1 is Negative");
		}
		if(number1 + number1 != 0) {
			System.out.println("Number 1 is negative");
		}
	}
}