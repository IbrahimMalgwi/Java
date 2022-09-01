package classWork;

public class Factors {
    public static int factorial(int number){
        int total = 0;
        for (int i = number; i > 0; i --){
            if (number % i == 0){
                total +=1;
            }
        }
        return total;
    }

    public static boolean isPrime(int number){
        return true;
    }



    public static void main(String[] args) {
//        factors(6);
        System.out.println(factorial(6));

    }
}
