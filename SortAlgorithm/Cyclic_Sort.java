package SortAlgorithm;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        /*
        Use Cyclic Sort-- When you see given number of range from 1 to N.
        We know that every unique item is getting only swapped once.
         */
        int[] arr = {6, 3, 1, 4, 9, 8, 7, 2, 5};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Cyclic(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] == arr[correct]){
                i++;
            }else {
                swap(arr, i, correct);
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
