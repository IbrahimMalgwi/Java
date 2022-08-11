package Excersises;

public class MultiplicationTable {
    public static void main(String[] args) {
        table();
    }

    public static void table(){
        for (int row = 2; row <=12; row++){
            for (int column = 1; column <= 12; column++) {
                System.out.printf("%2d * %2d = %2d   ", row, column, (row * column));
            }
            System.out.println();
        }

    }
}
