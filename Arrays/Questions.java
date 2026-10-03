package Java_Concept.Arrays;

import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {

        int[] arr = {19, 233, 14, 15, 100, 12};

//        System.out.println(max(arr, 3, 12));
//        swap(arr, 4, 1);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    // swap two element of an array
//    static void swap(int[] arr, int idx1, int idx2){
//        int temp = arr[idx1];
//        arr[idx1] = arr[idx2];
//        arr[idx2] = temp;
//    }
    // find the max value.
//    static int max(int[] arr, int idx1, int idx2) {
//        int max = 0;
//
//        for (int i = idx1; i < idx2; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }

    // reverse the array
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
