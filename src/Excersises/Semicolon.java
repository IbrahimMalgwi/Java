package Excersises;

import java.util.Scanner;

public class Semicolon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Semicolon.setIsNative(1);
        System.out.println(Semicolon.getIsNative());
        System.out.println( Semicolon.isAaNative());
        if(Semicolon.isAaNative() == true){
            System.out.print("Enter Chort ID: ");

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
        else {
            System.out.println("You are not a Native");
        }
    }

    private static int isNative;

    public static void setIsNative(int isNative) {
        Semicolon.isNative = isNative;
    }

    public static int getIsNative() {
        return isNative;
    }

    public static boolean isAaNative(){
        boolean isNative;

        switch (getIsNative()){
            case 1:
                isNative = true;
                break;
            default:
                isNative = false;
                break;
        }
        return isNative;
    }
}
