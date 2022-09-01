package dietel.Chapter6;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Guessing {
    private int guess;
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Number to guess ");
        int guess = input.nextInt();

    int prediction  = 29;

    if (guess == prediction) {
        System.out.println("Your have guess the number correctly ");
    }
    else {
        System.out.println("Guess again the number you enter is wrong...");
    }
    }
}
