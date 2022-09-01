package classWork;

public class reverseDigit {
    public static int reverseNumber(int number){
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return reverse;
    }

    public static int reverseNumber1(int number){
        int reverse = 0;

        for (; number != 0; number/=10) {
            int digit = number % 10;
            reverse = reverse * 10 +digit;
        }

        return reverse;
    }

    public static void main(String[] args) {
        int number = 56789;
        System.out.println("Initial number: " + number +" Reversed Number " + reverseNumber1(number));
    }
}
