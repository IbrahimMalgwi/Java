package fummi;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        arrayList();
    }
    public static void arrayList(){

        Scanner input = new Scanner(System.in);
        int count7 = 0;

        ArrayList<Integer> numbers = new ArrayList<>();
        int userInput = input.nextInt();

        System.out.println("Enter numbers and -1 to stop");
        numbers.add(userInput);

        while (userInput != -1){

            userInput = input.nextInt();
            if (userInput != -1) {
                numbers.add(userInput);
            }
        }

        for (int number : numbers){
            if (number < 0){
                System.out.println(number + " is -tive number");
            } else {
                System.out.println(number + " is +tive number ");
            }
        }

        for (int count : numbers){
            if (count == 7){
                count7++;
            }
        }

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.contains(7));
        System.out.println("Number of 7 is " + count7);

    }
}
