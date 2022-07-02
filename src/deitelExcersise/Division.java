// 2.25 An application that reads an integer and determines and prints whether it’s divisible by 3 or not.

import java.util.Scanner;

public class Division  {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = input.nextInt();

		int numberDiv = number % 3;
		
		if(numberDiv == 0){
			System.out.println("Number is divisible by 3");
		}
		
		if(numberDiv != 0){
			System.out.println("Number is not divisible by 3");
		}
	}
}
 