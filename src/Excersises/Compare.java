/* 2.16 Write an application that asks the user to enter one integer, 
obtains it from the user and displays whether the number and 
its square are greater than, equal to, not equal
to, or less than the number 100. */

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int number = input.nextInt();
		
		int numberSquare = number * number;

		if(number > 100) {
			System.out.println("Number is greater than 100");
		}

		if(number == 100) {
			System.out.println("Number is equal to 100");
		}

		if(number != 100) {
			System.out.println("Number is not equal to 100");
		}

		if(number < 100) {
			System.out.println("Number is less than 100");
		}

		if(numberSquare > 100) {
			System.out.println("dietelChapter2.Square is greater than 100");
		}

		if(numberSquare == 100) {
			System.out.println("dietelChapter2.Square is equal to 100");
		}

		if(numberSquare != 100) {
			System.out.println("dietelChapter2.Square is not equal to 100");
		}

		if(numberSquare < 100) {
			System.out.println("dietelChapter2.Square is less than 100");
		}

	}
}