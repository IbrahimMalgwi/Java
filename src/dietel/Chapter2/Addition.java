package dietel.Chapter2;
import java.util.*;

public class Addition {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number1;
            int number2;
            int sum;

            System.out.println("Enter first integer: ");
            number1 = input.nextInt();

            System.out.println("Enter second integer: ");
            number2 = input.nextInt();

            sum = number1 + number2;
            System.out.printf("Sum is %d%n", sum);
        }
}
