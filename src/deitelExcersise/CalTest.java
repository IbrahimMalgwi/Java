public class CalTest {
	public static void main(String[] args) {
		
		Calculations result = new Calculations();

		int add = result.addition(2, 3);
		
		int sub = result.subtraction(9, 5);

		int div = result.division(15, 3);

		int mul = result.multiplecation(6, 5);

		System.out.printf("Additions is: %d%n", add);
		System.out.printf("Subtraction is: %d%n", sub);
		System.out.printf("Division is: %d%n",div);
		System.out.printf("Multiplecation is:  %d%n",mul);
	}
}