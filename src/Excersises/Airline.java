package Excersises;

import java.util.Scanner;

public class Airline {

//    final int SEAT_NUMBER = 10;
    boolean[] seats; // = new boolean[SEAT_NUMBER];

    private int firstClass = 0;
    private int economyClass = 0;

    public Airline(int passengers) {
        this.seats = new boolean[passengers];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Airline airline = new Airline(10);

        int userInput;

        do {
            airline.getAvailableSeats();
            System.out.print("ENTER 1 FOR FIRST CLASS OR 2 ECONOMY CLASS: ");
            userInput = input.nextInt();
            airline.booking(userInput);
        }
        while (userInput != 9);

    }

    public void getAvailableSeats() {
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                System.out.println("SEAT" + " " + (i + 1) + " IS AVAILABLE");
            } else {
                System.out.println("SEAT" + "" + (i + 1) + " IS NOT AVAILABLE");
            }
        }
    }

        public void booking (int userInput){
            switch (userInput) {
                case 1 -> firstClass();
                case 2 -> economyClass();
                default -> System.out.println("YOU MADE THE WRONG CHOICE");
            }
        }


    public void firstClass(){
        for (int i = 0; i < 5; i++){
            if (!seats[i]){
                seats[i] = true;
                System.out.println("YOU HAVE BOOKED" + "  " + (i +1) + "IN FIRST CLASS");
                firstClass++;
                if (firstClass == 5)
                    System.out.println("NO MORE AVAILABLE SEATS IN FIRST CLASS, WOULD YOU LIKE A SEAT IN ECONOMY CLASS ");
                break;
            }
        }
    }
    public void economyClass(){
        for (int i = 5; i < 10; i++){
            if (!seats[i]){
                seats[i] = true;
                System.out.println("YOUR HAVE BOOKED SEAT" + " " + (i +1) + " IN ECONOMY CLASS");
                economyClass++;
                if (economyClass == 5)
                    System.out.println("NO MORE SEAT IN ECONOMY CLASS, WOULD YOU LIKE A SEAT IN FIRST CLASS");
                break;
            }
        }
    }
}
