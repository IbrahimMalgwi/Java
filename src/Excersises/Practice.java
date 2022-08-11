package Excersises;
import java.util.Arrays;
import java.util.Scanner;



public class Practice {

    static void practice1 () {
        //while loop muliply by 3
        int product = 3;
        while (product <= 100) {
            product = 3 * product;
        }

        System.out.printf("%d", product);

        System.out.println();
    }

    static void practice2 () {

        // calculating grade with known number
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.print("Enter Grade: ");
            int grade = input.nextInt();
            total = grade + total;
            gradeCounter = gradeCounter + 1;
        }

        int average = total / 10;

        System.out.printf("%n Total of grade %d%n", total);
        System.out.printf("%n average is %d", average);
    }

    static void practice3 () {
//         calculating grade with sentinel control iteration
        System.out.println();
        Scanner input = new Scanner(System.in);

        int total1 = 0;
        int gradeCounter1 = 0;

        System.out.print("Enter grade and -1 to quit ");
        int grade1 = input.nextInt();

        while (grade1 != -1) {
            total1 = grade1 + total1;
            gradeCounter1 = gradeCounter1 + 1;

            System.out.print("Enter grade and -1 to quit ");
            grade1 = input.nextInt();

            if (gradeCounter1 != 0) {
                double average1 = (double) total1 / gradeCounter1;

                System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter1, total1);
                System.out.printf("Class average is %.2f%n", average1);
            } else { // no grades were entered, so output appropriate message
                System.out.println("No grades were entered");
            }
        }
    }

    static void practice4 () {

//         brake statement
        int count;

        for (count = 1; count <= 10; count++) {
            if (count == 5) {
                break;
            }
            System.out.printf("%d ", count);
        }
        System.out.printf("%n and broke out of loop at count = %d%n", count);
    }

    static void practice5() {

        // continue state
        int count;

        for (count = 1; count <=10; count++){
            if (count == 5){
                continue;
            }
            System.out.printf("%d ", count);
        }
        System.out.printf("%nused conitnue to skip printin 5%n");
    }

    static void practice6 (){
        System.out.println(Math.sqrt(900));
    }

    static void practice7 () {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three floating point number seperated by space:  ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.println("the maximum is " + result);
    }

    public static double maximum(double x, double y, double z) {
        double maximumValue = x;
        if (y > maximumValue){
            maximumValue = y;
        }
        if (z > maximumValue){
            maximumValue = z;
        }
        return maximumValue;
    }

    public static void practice8() {
        //97 integer value of character a

        char[] alpha = new char[26];

        for (int a = 0; a < 26; a++){
            alpha[a] = (char) (97 + a);
        }
        System.out.println(Arrays.toString(alpha));

      // This a New array

        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 9;
        numbers[4] = 7;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //this another array

        int[] array =  {10, 20, 30, 60, 70, 20};
        int total = 0;

        for (int g = 1; g < array.length; g++) {
            total += array[g];
        }

        System.out.printf("Total of sun is: %d%n", total);

    }

    static void practice10() {

        int counter = 0;

        while (counter <= 10) {
        System.out.printf("%d ", counter);
        ++counter;
        System.out.println();
        }
    }

    static void practice11(){
        for (int counter = 1;  counter <= 10; counter++) {
            System.out.printf("%d", counter);
            System.out.println();
        }
    }

    static void practice12(){
        int x = 2;
        int y = 10;

        for (int j = x; j <= 4 * x * y; j += y/x){
            System.out.printf("%d", j);
            System.out.println();
        }
    }

    static void practice13() {
        // for statement
        int total = 0;
        for (int number = 2; number <= 20; number += 2) {
            total += number;
            System.out.printf("the Sum is: %d%n", total);
        }
    }

    static void practice14(){
        //interest rate calculations
        double amount;
        double principal = 10000;
        double rate = 0.05;

        System.out.printf("%s %20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++) {
            amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }

    static void practice15(){
        //printing asterisks
        System.out.println("*********   ***     *        *");
        System.out.println("*       *  *   *   ***     *  *");
        System.out.println("*       * *     * *****   *    *");
        System.out.println("*       * *     *   *    *      *");
        System.out.println("*       * *     *   *   *        *");
        System.out.println("*       * *     *   *    *      *");
        System.out.println("*       * *     *   *     *    *");
        System.out.println("*       *  *   *    *      *  * ");
        System.out.println("*********   ***     *       *");
    }

    static void practice16(){
        // do while statement

        int counter = 0;

        do {
            System.out.printf("%d", counter);
            ++counter;
        } while (counter <= 10);
        System.out.println();
    }

    static void practice17() {
        Scanner input = new Scanner(System.in);
        int minimumNumber = 1_000_000_000;
        int maximumNumber = 0;

        int count = 0;

        while (count < 5){
            System.out.println("Enter Numbers ");
            int number = input.nextInt();
            count++;
            if (number < minimumNumber){
                minimumNumber = number;
            }
            if (number > maximumNumber){
                maximumNumber = number;
            }
        }
        System.out.printf("The lowest number is: %d", minimumNumber);
        System.out.println();
        System.out.printf("The largest number is: %d", maximumNumber);
    }

    static void practice18(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1");
        var userInput = input.nextInt();
        var largestNumber = userInput;
        var lowestNumber = userInput;

        var count = 1;

        while (count < 5){
            System.out.printf("Enter Number %d%n", count +1);

           userInput = input.nextInt();

            if (userInput > largestNumber){
                largestNumber = userInput;
            }
            if (userInput < lowestNumber){
                lowestNumber = userInput;
            }
            count = count +1;
        }
        System.out.printf("the largest number is %d%n", largestNumber);
        System.out.printf("the lowest number is %d", lowestNumber);
    }

    static void practice19(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");

        int number = input.nextInt();

        if(number == 0){
            System.out.println(1);
        } else if (number == 1) {
            System.out.println(0);
        }
    }

    static void practice20(){
        double num1 = 200.300;
        double num2 = 0.300;

        double result = num1 * num2;

        System.out.print("my number is  "+ result);
    }

    static void practice21(){
            // create a string
            String message = "everyone loves java";

            // stores each characters to a char array
            char[] charArray = message.toCharArray();
            boolean foundSpace = true;

            for(int i = 0; i < charArray.length; i++) {

                // if the array element is a letter
                if(Character.isLetter(charArray[i])) {

                    // check space is present before the letter
                    if(foundSpace) {

                        // change the letter into uppercase
                        charArray[i] = Character.toUpperCase(charArray[i]);
                        foundSpace = false;
                    }
                }

                else {
                    // if the new character is not character
                    foundSpace = true;
                }
            }

            // convert the char array to the string
            message = String.valueOf(charArray);
            System.out.println("Message: " + message);

    }

    public static void practice22(String name){
    }


    public static void main(String[] args) {
        practice21 ();
    }
}