import java.util.Scanner;

public class Lane {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your Speed: ");
		double speed = input.nextDouble();

		System.out.print("Enter acceleration: ");
		double acceleration = input.nextDouble();

		double runWay = (speed * speed) / (2 * acceleration);

		System.out.printf("Run way length for this plane is : %.3 f", runWay);

	}

}