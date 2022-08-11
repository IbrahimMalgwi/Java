package dietel.Chapter3;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;

public class Calculator {

    public int addTwoNumbers(int number1, int number2) {
       int sumNumbers = number1 + number2;
       System.out.println("The sum is " +sumNumbers);
       return sumNumbers;
    }

    public int subractTwoNumerbs(int number3, int number4) {
        int subNumbers = number3 - number4;
        System.out.println("The difference is " +subNumbers);
        return subNumbers;
    }

    public int multiplyTwoNumbers(int number3, int number4) {
        int multNumbers = number3 * number4;
        System.out.println("The product is " +multNumbers);
        return multNumbers;
    }
    public int dividTwoNumbers(int number3, int number4) {
        int divNumbers = number3 / number4;
        System.out.println("The division is " +divNumbers);
        return divNumbers;
    }
}

