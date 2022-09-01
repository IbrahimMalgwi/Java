package classWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayClassWorkChibuzor {

    
    public static int maxNumber(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
          return max;
    }

    public static int minNumber(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) min = array[i];
        }

        return min;
    }

    public static int arraySumMax(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                }
                sum += array[j];
                if (sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void arrayMaxAndMin(int[] array){
        int[] newArray = new int[array.length];
        int sum = 0;
        for (int i = 0; i < array.length ;) {
            for (int j = 0; j <array.length ; j++) {
                sum += array[j];
            }
            for (int k = 0; k < array.length; k++) {
                newArray[k] += sum - array[k];
                i++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static int maxAndMinSorted(int[] array){
        int max = 0;
        int min = 0;

        return  max; // System.out.println("The maximum is:" + max + "The minimum is:" +min);
    }

    public static void main(String[] args) {

        int[] array = {2, 3, 1, 5, 4};
        arrayMaxAndMin(array);
    }

}
