import java.util.Scanner;

public class HouseTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		House appartment = new House();

		System.out.println("Please enter the name: ");
		String newInput = input.nextLine();
		appartment.setName(newInput);

		System.out.printf("You bought Petrol at: %n%s%n", appartment.getName());

	}

}