package dietel.Chapter7;

import java.util.Scanner;

public class AirlineReservation {
    private static final int TOTAL_SEATS = 11;
    private static final boolean[] seats = new boolean[TOTAL_SEATS];

    private enum Class {
        FIRST, ECONOMIC
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option = 0;
        int seatNumber = 0;

        while (option != 9) {
            System.out.print(" - Please type\n" + "1 for First Class and \n" + "2 for Economy or\n" + "9 to quit.\n"
                    + " --> Option: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    seatNumber = checkAvailableSeat(Class.FIRST);

                    if (seatNumber != -1) {
                        assignSeat(seatNumber);
                        displayBoardingPass(seatNumber, Class.FIRST);
                    } else { // try in another section
                        seatNumber = checkAvailableSeat(Class.ECONOMIC);

                        if (seatNumber != -1) {
                            System.out.print(
                                    "\n\tFirst class is full!\nAccepts to be placed in the economic section?\n1 - Yes\n2 - Not\nEnter your option: ");
                            option = input.nextInt();

                            if (option == 1) {
                                assignSeat(seatNumber);
                                displayBoardingPass(seatNumber, Class.ECONOMIC);
                            } else
                                System.out.println("\nNext flight leaves in 3 hours.\n");
                        } else
                            System.out.println("\nNo more seats available. The plane is full.\n");
                    }
                    break;
                case 2:
                    seatNumber = checkAvailableSeat(Class.ECONOMIC);

                    if (seatNumber != -1) {
                        assignSeat(seatNumber);
                        displayBoardingPass(seatNumber, Class.ECONOMIC);
                    } else { // try in another section
                        seatNumber = checkAvailableSeat(Class.FIRST);

                        if (seatNumber != -1) {
                            System.out.print(
                                    "\n\tEconomic section is full!\nAccepts to be placed in the first-class section?\n1 - Yes\n2 - Not\nEnter your option: ");
                            option = input.nextInt();

                            if (option == 1) {
                                assignSeat(seatNumber);
                                displayBoardingPass(seatNumber, Class.FIRST);
                            } else
                                System.out.println("\nNext flight leaves in 3 hours.\n");
                        } else
                            System.out.println("\nNo more seats available. The plane is full.\n");
                    }
                    break;
                case 9:
                    break;
                default:
                    System.out.println("\nInvalid option. Try again.\n");
                    break;
            }
        }

        input.close();
    }

    public static void displayBoardingPass(int seatNumber, Class section) {
        System.out.println("\n\t  Boarding Pass");
        System.out.printf("\tSeat number: %d%n\tClass: %s%n%n", seatNumber, section);
    }

    public static void assignSeat(int seatNumber) {
        seats[seatNumber] = true;
    }

    public static int checkAvailableSeat(Class section) {
        int seatNumber = -1;

        switch (section) {
            case FIRST:
                for (int i = 1; i <= TOTAL_SEATS / 2; i++) {
                    if (seats[i] == false) {
                        seatNumber = i;
                        break;
                    }
                }
                break;
            case ECONOMIC:
                for (int i = TOTAL_SEATS / 2 + 1; i < TOTAL_SEATS; i++) {
                    if (seats[i] == false) {
                        seatNumber = i;
                        break;
                    }
                }
                break;
        }
        return seatNumber;
    }

}
