package dietel.Chapter4;

import java.util.Scanner;

public class Pertten {
    public static void main(String[] args) {
        pattern5(5);
    }


    static void pattern1(int n) {
        int i, j, space = 1;
        space = n - 1;
        for (j = 1; j <= n; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern2 (int n) {
        for (int i = 1; i <= 5; i++) {
//            int n = 5;

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        int i, j,num;

        for(i=0; i<n; i++) {
            num=1;
            for(j=0; j<=i; j++) {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }

    static void pattern4 (int n){
        int rows = 6;

        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5 (int n){
        int rows = 6;

        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }

    static void pattern6 (int n) {
        int m = 10;
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 2 * (m - i); j >= 0; j--)
            {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7 (int n) {

        int rows = 10;
        for (int i= rows-1; i>=0 ; i--) {
            for (int j=0; j<=i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern8 (int n){
        int rows = 10;
        for (int i= rows; i>= 1; i--) {
            for (int j=rows; j>i;j--) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern9 (int n) {

        int i, j,num;

        for(i=0; i < n; i++) {
            num=1;
            for(j=0; j<=i; j++) {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }

    static void pattern10 (int n) {

    }

}

