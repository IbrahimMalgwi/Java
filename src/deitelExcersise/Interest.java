import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your loan Balance: ");
		double balance = input.nextDouble();

		System.out.print("Enter your annual intrest rate: ");
		double interestRate = input.nextDouble();

		double interest = balance * (interestRate/1200);

		System.out.printf("The intrest is %.5f", interest);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("This is a new one");
		System.out.println();

		// new calculation
		double principal = 1000;
		double rate = 0.05;

		System.out.printf("%s %n", "Year", "Amount on deposit");

		for (int year = 1; year <= 10; ++year){
			double amount = principal * Math.pow(1.0 + rate, year);

			System.out.printf("%4d%,20.2f%n", year, amount);
		}
	}

}