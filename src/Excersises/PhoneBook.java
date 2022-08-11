package Excersises;

import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> addName = new ArrayList<String>();
        ArrayList<String> addAddress = new ArrayList<String>();
        ArrayList<String> addNumber = new ArrayList<String>();
        ArrayList<String> addEmail = new ArrayList<String>();

        String exit = "";

        while(exit.isEmpty()){
            System.out.println("ENTER CONTACT NAME: ");
            String name = input.nextLine();
            addName.add(name);

            System.out.println("ENTER CONTACT ADDRESS: ");
            String address = input.nextLine();
            addAddress.add(address);

            System.out.println("ENTER CONTACT NUMBER: ");
            String number = input.nextLine();
            addNumber.add(number);

            System.out.println("ENTER CONTACT EMAIL: ");
            String email = input.nextLine();
            addEmail.add(email);

            System.out.println("PRESS ENTER TO CONTINUE OR -1 TO QUIT");
            exit = input.nextLine();
        }

        System.out.println("NAME: " + addName + "\n" + "ADDRESS: " + addAddress + "\n" +
                "NUMBER: " + addNumber + "\n" +  "EMAIL: " + addEmail
        );
    }
}


