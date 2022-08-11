package dietel.Chapter5;

public class NumberTriangle {

    public static void main(String[] args) {

//        for(int A=1; A<=6; A++) {
//            for(int B=1; B<=A; B++)
//            {
//                System.out.print(B);
//            }
//            System.out.println();
//        }

//
        // Another one

        for (int i = 0; i <= 5; i++) {
            int number = 1;
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((int) (number + k));
            }
            for (int l = i - 1; l >= 0; l--) {
                System.out.print((int) (number + l));
            }
            System.out.println();
        }
    }

}



