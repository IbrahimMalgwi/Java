package dietel.Chapter2;/* Question 2.28 An application that calculate the Diameter, Circumfrence and
area of a circle using 3.14159 for π.
*/

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Radius of the circle: ");
		int radius = input.nextInt();

		System.out.printf("Diameter of the circle is: %d%nCircumference of the circle is : %f%nArea of the circle is : %f%n", (2 * radius),(2 * Math.PI * radius),(Math.PI * (radius * radius)));
	}
}