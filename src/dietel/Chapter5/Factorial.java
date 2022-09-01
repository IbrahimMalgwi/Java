package dietel.Chapter5;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("n \t n!");
        for (int number = 1; number <= 20; number++) {
            long factorial = 1;
            for (int smaller = 1; smaller <= number; smaller++) {
                factorial = factorial * smaller;
            }
            System.out.println(number + "\t" + factorial);
        }
    }
}


