package Excersises;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 7, 10, 45, 20, 88, 3, 5, 11, 8, 9};
        System.out.print(Arrays.toString(array));
        System.out.println();
        sortArray(array);
    }

    public static void sortArray(int [] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                int tempValue = 0;
                if (array[i] > array[j]){
                    tempValue = array[i];
                    array[i] = array[j];
                    array[j] = tempValue;
                }
            }

        }
        for (int a : array){
            System.out.print(a + ","+" ");
        }

    }
}
