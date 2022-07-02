import java.util.Scanner;

public class NumberTriangle2 {

    public static void main(String[] args) {
        int rows;
        int number1 = 1;
        int counter1 = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = input.nextInt();

        while (counter1 <= rows){
            int number2 = 0;
            int counter2 = 1;

        while (counter2 <= counter1)
            System.out.printf("%d", number1 + number2);

            number2 ++;
            counter2 ++;
            counter1 ++;
        }
        System.out.println();

    }
}
