package Excersises;

public class SumAndProductLoops {
    public static void main(String[] args) {

        int sum = 0;
        int product = 1;
        for (int i = 1; i <=5 ; i++) {
            sum = sum+i;
            product = product*i;

        }
        System.out.println("Sum = "+sum + " Product = " +product);
    }
}
