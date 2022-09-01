package Excersises;//package Excersises;

public class TrianglePatterns {
    public static void increasingTriangle(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void decreasingTriangle(){
        int n =5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
        
    public static void reflectedRightAngle(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedTriangle(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rightSidedTriangle(){
        int n = 5;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hillPattern(){
        int n = 5;
        for(int i =1; i<=n; i++){
            for (int j = i; j <= n; j ++){
                System.out.print("  ");
            }
            for (int j=1; j<i; j++){
                System.out.print("* ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void reverseHill(){
        int n = 5;
        for(int i =1; i<=n; i++){
            for (int j = 1; j <= i; j ++){
                System.out.print("  ");
            }
            for (int j=i; j<n; j++){
                System.out.print("* ");
            }
            for (int j = i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void diamondPattern(){
        int n = 5;
        for(int i =1; i<n; i++){
            for (int j = i; j <= n; j ++){
                System.out.print("  ");
            }
            for (int j=1; j<i; j++){
                System.out.print("* ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i =1; i<=n; i++){
            for (int j = 1; j <= i; j ++){
                System.out.print("  ");
            }
            for (int j=i; j<n; j++){
                System.out.print("* ");
            }
            for (int j = i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
//       increasingTriangle();
//        System.out.println("---------------------------------------------");
//       decreasingTriangle();
//        System.out.println("---------------------------------------------");
//        reflectedRightAngle();
//        invertedTriangle();
//        rightSidedTriangle();
//        hillPattern();
//        reverseHill();
        diamondPattern();
    }



}
