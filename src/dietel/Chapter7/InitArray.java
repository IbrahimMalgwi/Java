package dietel.Chapter7;

public class InitArray {

    public static void array(){
        int [] array = new int[10];

        System.out.printf("%s%8%s%n", "Index", "Value");

        for (int counter = 0; counter < array.length ; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);

        }
    }
    public static void array1(){
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%s%8%s%n", "Index", "Value");

        for (int counter = 0; counter < array.length ; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }

    public static void main(String[] args) {
        array1();
    }

}
