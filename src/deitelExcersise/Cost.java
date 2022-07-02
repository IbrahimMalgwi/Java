import java.util.Scanner;

public class Cost {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter distance to travel: ");
		double distance  = input.nextDouble();

		System.out.print("Enter miles per gallon: ");
		double miles = input.nextDouble();

		System.out.print("Enter price per gallon: ");
		double price = input.nextDouble();

		double cost = (distance / miles) * price;

		System.out.printf("The cost of driving is $%.2f",cost);

	}
	
}