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
	}

}