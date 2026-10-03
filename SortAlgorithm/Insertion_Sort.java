package SortAlgorithm;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        /*
        Use: Steps get reduced if array is sorted.
        NO. of swaps reduced as compared to bubble sort.
        Stable
        Used for smaller value of n works good when array is partially sorted part of the array sorted
        array is not sorted completely
         */
        int[] arr = {8, 90, -7, -12, 23, 54, 34};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }

    }
    static void swap(int[] arr, int second, int first){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
