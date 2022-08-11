package dietel.Chapter2;// Question 2.33 An Application that calculate Body Mass Index

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	System.out.print("Enter your weight in KG: ");
	int weight = input.nextInt();

	System.out.print("Enter your height in M: ");
	int height = input.nextInt();

	int bmi = weight / (height * height);

	System.out.println(bmi);

		if(bmi < 18.5){
			System.out.println("You are Underweight");
		}

		if(bmi >= 18.5 && bmi <= 24.9){
			System.out.println("You have a normal weight");
		}

		if (bmi >= 25 && bmi <= 29.9){
			System.out.println("You are over weight");
		}

		if(bmi >= 30){
			System.out.println("You are obesed");
		}
	}
}