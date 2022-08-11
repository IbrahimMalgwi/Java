package africa.semicolon.dietel.Chapter7;

public class Arrays {

    public static void a1(){
        final int ARRAY_LENGTH = 10;

        int [] multiplcation = new int[ARRAY_LENGTH];

        for (int counter = 0; counter < multiplcation.length; counter++)
            multiplcation[counter] = 2 + 2 * counter;
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < multiplcation.length; counter++)
            System.out.printf("%5d%8d%n", counter, multiplcation[counter]);
    }

    public static void a2(){
        int[] array = new int[10];

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }

    public static void a3(){
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%s%8s%n", "index", "Value");

        for (int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }

    public static void a4(){
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for (int counter = 0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;
        }
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }

    public static void a5(){
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        int total = 0;
        for (int counter = 0; counter < array.length; counter++){
            total += array[counter];
        }

        System.out.printf("Total of array elements: %d%n", total);
    }

    public static void main(String[] args) {
        a5();
    }
}

