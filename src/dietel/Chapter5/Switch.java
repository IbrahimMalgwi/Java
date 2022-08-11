package dietel.Chapter5;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        String grade = " ";
        int score = 0;

        Scanner input = new Scanner(System.in);
        for (int counter = 1; counter <=6; counter++){
            System.out.println("Enter your grade: ");
            score = input.nextInt();

            switch (score / 10) {
                case 9:
                    grade = ("Your grade is A");
                    break;
                case 8:
                    grade = ("Your grade is B");
                    break;
                case 7:
                    grade = ("Your grade is C");
                    break;
                case 6:
                    grade = ("Your grade is D");
                    break;
                case 5:
                    grade = ("Your grade is E");
                case 4:
                    grade = ("Your grade is F");
                    break;
                default:
                    System.out.println("Please enter a valid number");
                    break;
            }

            System.out.printf("Your score is %d and your grade is %s%n", score, grade);
        }

    }
}