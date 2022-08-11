package dietel.Chapter5;

import java.util.Scanner;

public class ex5_16 {
    public static void main(String[] args) {
        System.out.println("Enter five number: ");
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, num5 = 0;
        int inputNUmber, counter = 1;

        while (counter <=5){
            inputNUmber = input.nextInt();
            if (inputNUmber >=1 && inputNUmber <=30){
                switch (counter){
                    case 1:
                        num1 = inputNUmber;
                        break;
                    case 2:
                        num2 = inputNUmber;
                        break;
                    case 3:
                        num3 = inputNUmber;
                    case 4:
                        num4 = inputNUmber;
                    case 5:
                        num5 = inputNUmber;
                        break;                }
            }
            counter++;
//        } else {
            System.out.println("Please enter number between 1 and 30");
        }
    }
//    int value = 0;
//    for(cou)
}
