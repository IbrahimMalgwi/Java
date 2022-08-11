package Excersises;

import java.util.*;

public class Trial {

    public static int product(int... numbers) {
        if (numbers.length == 0)
            return 0;

        int total = 1;

        for (int number : numbers)
            total *= number;

        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.nextLine();

        System.out.println(product());
        System.out.println(product(10));
        System.out.println(product(10, 10));
        System.out.println(product(10, 10, 10));
        System.out.println(product(10, 10, 10, 10));
    }

    String name, lastName = "moses, John";
    Object man = "james";
    Object number = 20;

}
