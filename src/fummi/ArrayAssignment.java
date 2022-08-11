package fummi;

import dietel.Chapter4.Interest;
import dietel.Chapter7.Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayAssignment {
    public static void copyArrayList(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(12);
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(4);

        for (int num : list){
            System.out.println(num);
        }
    }
    public static void reverseArrayList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(12);
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(4);

        for (int i = list.size() - 1; i >= 0; i-- ){
            System.out.print(list.get(i) + " ");
        }

    }

    public static void cloneArray(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(12);
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(4);

        ArrayList newList = new ArrayList<>();

        newList = (ArrayList) list.clone();

        System.out.print("First ArrayLit" + list);
        System.out.println();
        System.out.print("Second ArrayList" + newList);
    }

    public static void copyArray(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(7);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.addAll(list);

        System.out.println("List "  + list);
        System.out.println("newList" + newList);


    }
    public static void sortArray(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(12);
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(4);

        Collections.sort(list);

        for (int num : list){
            System.out.print(num + " ");
        }
    }


    public static void main(String[] args) {
//        copyArrayList();
//        reverseArrayList();
//        cloneArray();
//        copyArray();
        sortArray();
    }
}
