package array;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String [] names = new  String[10];
        int [] scores = new int[10];

        for (int i = 0; i < scores.length ; i++) {
            System.out.println("Enter name and score: ");
            names[i] = input.nextLine();
            scores[i] = input.nextInt();
            System.out.println(names);
            System.out.println(scores);
        }


    }
}
