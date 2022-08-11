package dietel.Chapter2;

import java.util.Scanner;

public class BodyMassIndex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your weight in pound: ");
		double weight = input.nextDouble();

		System.out.print("Enter your height in inches: ");
		double height = input.nextDouble();

		double weightKg = weight * 0.45359237;
		double heightM = height * 0.0254;

		double bmi = weightKg / (heightM * heightM);

		System.out.printf("Your Body Mass Index is: %.4f", bmi);
	}


}