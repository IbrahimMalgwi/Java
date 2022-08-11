package dietel.Chapter5;

public class Counters {
    public static void main(String[] args) {
        doWhile();
    }

    static void whileCOunter(){
        int counter = 1;

        while(counter <= 10){
            System.out.printf("%d ", counter);
            ++counter;
        }
        System.out.println();
    }

    static void forCounter(){
        for (int i = 1; i <= 10; i++)
            System.out.printf("%d ", i);
    }

    static void sumNum(){

        int total = 0;
        for (int number = 2; number <= 20; number +=2)
            total += number;

        System.out.printf("%d ", total);
    }

    static void doWhile(){
        int counter = 1;

        do {
            System.out.printf("%d", counter);
            ++counter;
        } while (counter <=10);
        System.out.println();
    }
}
