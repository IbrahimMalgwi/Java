package Excersises;

import java.util.*;

public class Practice3 {
    public static void main(String[] args) {
        loop1();

    }

        static void arrayList() {
            Scanner input = new Scanner(System.in);
            ArrayList<String> memory = new ArrayList<String>();

            while (true){
                memory.add(input.nextLine());

                if((memory.get(memory.size()-1).equals("CLEAR"))) {
                    memory.clear();
                } else {
                    if ((memory.get(memory.size() - 1).equals("END")))
                        break;
                }

                System.out.println(memory.toString());
            }

        }
        static void factorial(){
            Scanner input = new Scanner(System.in);


            int number, factorial = 1;
            System.out.println("Enter number to get it's factorial");
            number = input.nextInt();

            while (number >0 ) {
                factorial = factorial * number;
                number--;
            }
            System.out.println("Factorial = " +factorial);
        }

        static void factorial1(){
            Scanner input = new Scanner(System.in);

            double e = 1.0;
            int number = 1, accuracy, factorial = 1;

            System.out.println("Enter desired accuracy: ");
            accuracy = input.nextInt();

            while (number < accuracy ) {
                factorial = factorial * number;
                e = e+ 1.0 / factorial;
                number++;
            }
            System.out.printf("e %.5f", e);
        }

        static void factorial2(){
        Scanner input = new Scanner(System.in);
        int number, accuracy, factorial, x;
        double e, exponent;

        number = 1;
        factorial = 1;
        e = 1.0;
        exponent = 1.0;

            System.out.print("Enter exponent value: ");
            x = input.nextInt();

            System.out.println("Enter accuracy value: ");
            accuracy = input.nextInt();

            while (number < accuracy){
                exponent = exponent * x;
                factorial = factorial * number;
                e = e + exponent / factorial;
                number++;
            }
            System.out.printf("e to the x = %.5f", e);
        }

        static void loop1() {
            int count; // control variable also used after loop terminates

                for (count = 1; count <= 10; count++) { // loop 10 times
                if (count == 5) {
                continue;
                      }
                System.out.printf("%d ", count);
                }
                System.out.printf("%nBroke out of loop at count = %d%n", count);
    }
}


