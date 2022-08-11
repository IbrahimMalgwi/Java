package fummi;
import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        isPerfect();
    }

    public static void isPerfect(){
        int i = 1;
        int number= 1000;
        int sum = 0 ;
        Scanner input  = new Scanner(System.in);
        System.out.println("\n Please Enter any Number: ");
        number = input.nextInt();

        for(i = 1 ; i < number ; i++) {
            if(number % i == 0)  {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.printf("\n% d is a Perfect Number", number);
        }
        else {
            System.out.printf("\n% d is NOT a Perfect Number", number);
        }
    }
}
