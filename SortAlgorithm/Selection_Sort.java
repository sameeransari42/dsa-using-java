package SortAlgorithm;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        /*
        Selection sor basically means select an element and put them it's correct position.
        It's perform well on small list/array.
         */
        int[] arr = {6, 5, 3, 7, 2, 4, 1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int last = arr.length - 1 - i;
            int max = getMax(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

//    static void Selection(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            int last = arr.length-1-i;
//            int max = getMaxIdx(arr, 0, last);
//            swap(arr, max, last);
//        }
//    }
//    static int getMaxIdx(int[] arr, int start, int end){
//        int max = start;
//        for (int i = 0; i <= end; i++){
//            if (arr[max] < arr[i]){
//                max = i;
//            }
//        }
//        return max;
//    }
//    static void swap(int[] arr, int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }

}
