package dietel.Chapter2;/* question 2.15 application that asks the user to enter two integers,
obtains them from the user and prints the square of each, 
the sum of their squares, and the difference of the squares 
(first number squared minus the second number squared). */

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();

		System.out.print("Enter second number: ");
		int num2 = input.nextInt();

		int squareNum1 = num1 * num1;
		int squareNum2 = num2 * num2;

		int sumSquare = squareNum1 + squareNum2;
		int difSquare = squareNum1 - squareNum2;

		System.out.printf("dietelChapter2.Square of Num 1 is %d%nSquare of num 2 is %d%nSum of dietelChapter2.Square is %d%nDifference of square is %d%n", squareNum1,squareNum2,sumSquare,difSquare);
		
	}
}