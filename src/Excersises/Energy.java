package Excersises;

import java.util.Scanner;

public class Energy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of water in KG: ");
		double water = input.nextDouble();

		System.out.print("Enter Initial tempreture: ");
		double initialTemperature = input.nextDouble();

		System.out.print("Enter finalTempreture: ");
		double finalTemperature = input.nextDouble();

		double energy = (finalTemperature - initialTemperature) * 4184;

		System.out.printf("The energy needed is %f", energy);
	}
}