package dietel.Chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int normalPay = 200;
        int grossSales = 0;
        double totalEarning;
        int itemsSold = 1;

        System.out.println("Enter cost of items sold \n and 0 to end: ");
        double itemCost = input.nextDouble();
        while(itemCost > 0) {
            System.out.println("Enter cost of items sold \n and 0 to end: ");
            itemCost = input.nextDouble();
            grossSales += itemCost;
            itemsSold++;
        }
        totalEarning = normalPay + (0.09 * grossSales);
        System.out.println("Salesperson's total earning is " + totalEarning);
    }
}
