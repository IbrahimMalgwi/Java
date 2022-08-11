package dietel.Chapter2;/* 2.26 An application that reads two integers,
determines whether the first number tripled is a multiple 
of the second number doubled, and prints the result. */

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
			System.out.print("Enter firs number: ");
			int number1 = input.nextInt();

			System.out.print("Enter second number: ");
			int number2 = input.nextInt();

			int numberTriple = number1 * 3;
			int numberDouble = number2 * 2;

			int result = numberDouble % numberTriple;

			if(result == 0){
				System.out.println("Number 1 triple, is a multiple of number 2 double");
			}

			if(result != 0){
				System.out.print("Number 1 triple, is not a multiple of number 2 double");
			}	
	}
}