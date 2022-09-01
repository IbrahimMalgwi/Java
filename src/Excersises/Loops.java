package Excersises;

public class Loops {
    public static void main(String[] args) {
//        for (int i = 0; i <=5 ; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            for (int j = 5; j <= ; j++) {
//                for (int l = 5; l < ; k++) {
//                    System.out.print("*");
//                }
////                System.out.println();
//            }
//        }

//        for (int i = 0; i <=5 ; i++) {
//            for (int space = i; space <=5; space++){
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

        for (int i = 0; i <10 ; i++) {
            if (i < 5){
                for (int j = 0; j <=i ; j++) {
                    System.out.print("*");
                }
            }
            if (i >= 5){
                for (int j = 10; j > i; j --) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
