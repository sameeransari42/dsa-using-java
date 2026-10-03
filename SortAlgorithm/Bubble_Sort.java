package SortAlgorithm;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    // This sort algorithm push the max element to the last by adjacent swap
    static void bubble(int[] arr){
        boolean swapped;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            for (int j = 1; j < arr.length - i; j++){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                System.out.println("hello");
                break;


            }
        }
    }
}
