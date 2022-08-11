package dietel.Chapter7;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.security.SecureRandom;
import java.util.Iterator;

public class Array {

    static void arrayPractice1() {
        //97 integer value lower character a
        char[] alpha = new char[26];

        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) (97 + i);
        }

        System.out.println(Arrays.toString(alpha));
    }

    static void arrayPractice2() {
        int boardDim = 8;
        char[][] board = new char[boardDim][boardDim];
        boolean isWhite = false;

        for (int y = 0; y < board.length; y++) {
            isWhite = !isWhite;
            for (int x = 0; x < board[y].length; x++) {
                if (isWhite) board[y][x] = 'W';
                if (!isWhite) board[y][x] = 'B';
                isWhite = !isWhite;
            }
        }
        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }
    }

    static void arrayListPractice(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        System.out.println("Iterate through array list with for loop");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list);
        }
    }

    static void arrayListPractice1(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        System.out.println("Iterate through array list with for loop");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list);
        }
    }
    static void arrayListPractice2() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        System.out.println("Iterate through array list with for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }
    }

    static void arrayListPractice3() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        System.out.println("Iterate through array list with for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }
    }

    static void arrayListPractice4(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(12);
        list.add(15);

        System.out.println("Iterate through array list with advance for loop");
        for (Integer num : list) {
            System.out.println(num);
        }
    }

    static void arrayListPractice5(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(12);
        list.add(16);
        list.add(20);

        System.out.println("Iterate through array list with while loop ");
        int count = 0;
        while (list.size()>count) {
            System.out.println(list.get(count));
            count++;
        }

    }

    static void arrayListPractice6(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        System.out.println("Iterate through Iteretor ");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    static void sortArray(){
        int[] array = {1, 9, 3, 9, 2, 5, 11, 27, 90, 8, 6, 4, 6, 7, 3};

        for (int i =0; i < array.length; i++){
           int current = array[i];
           int k;
           for(k=i-1; k>=0 && array[k] > current; k--){
               array[k +1] = array[k];
           }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sortArray();
    }
}

