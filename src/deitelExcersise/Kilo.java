// application to convert 

import java.util.Scanner;

public class Kilo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your weight in pounds: ");
		double pounds = input.nextDouble();

		double kilograms = pounds * 0.454;
	
		System.out.printf("Your weight in kilograms is: %f", kilograms);

	}
}