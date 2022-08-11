package dietel.Chapter2;

import java.util.Scanner;

public class ComparingIntegers {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first Integer: ");
		int number1 = input.nextInt();

		System.out.print("Enter second Integer: ");
		int number2 = input.nextInt();

		System.out.printf("First Integer is %d and Second Integer is %d%n", number1, number2);

		if(number1 > number2) {
			System.out.printf("%d is Lager", number1);
		}

		if(number2 > number1) {
			System.out.printf("%d is Lager", number2);
		}

		if (number1 == number2) {
			System.out.printf("%d %d this Numbers are equal", number1, number2);
		}
	}
}