package Excersises;
import java.util.Scanner;

public class SemicolonBuilding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("If student is a native of Semicolon\n Enter Chort ID: ");

        int chortNumber = input.nextInt();

        if ((chortNumber == 9) || (chortNumber == 12)) {
            System.out.println("Go to 3rd floor");
        } else if ((chortNumber == 10) || (chortNumber == 11)) {
            System.out.println("Go to 2nd Floor");
        } else System.out.println("Stay on ground floor");

        switch (chortNumber) {
            case 9 -> System.out.println("Enter Afin");
            case 10 -> System.out.println("Enter Fina");
            case 11 -> System.out.println("Enter Odobo");
            case 12 -> System.out.println("Enter Obodo");
            default -> System.out.println("Stay on ground floor");
        }

    }
    }



