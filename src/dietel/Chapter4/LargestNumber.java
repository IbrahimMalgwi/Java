package dietel.Chapter4;
import java.util.*;

public class LargestNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int largest = 0;
            int counter = 1;

            while (counter <= 10) {
                System.out.print("Enter a integer: ");
                int number = scanner.nextInt();

                if (counter == 1)
                    largest = number;
                else if (number > largest)
                    largest = number;

                counter++;
            }

            scanner.close();

            System.out.printf("Largest is %d%n", largest);
        }
}
