import java.util.Scanner;

public class Feet {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter foot: ");
		double feet = input.nextDouble();

		double meter = feet * 0.305;

		System.out.printf("Your meter is %f", meter);
	}
}