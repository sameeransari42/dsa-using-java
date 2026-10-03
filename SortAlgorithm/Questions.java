package SortAlgorithm;

import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 6, 1, 4, 7};
//        insertion(arr);
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
//    static void insertion(int[] arr){
//        for (int i = 0; i < arr.length; i++){
//            for (int j = i+1; j > 0; j--){
//                if (arr[j] < arr[j-1]){
//                    swap(arr, j, j-1);
//                }
//            }
//        }
//    }
//    static void swap(int[] arr, int second, int first){
//        int temp = arr[second];
//        arr[second] = arr[first];
//        arr[first] = temp;
//    }

    static void cyclic(int[] arr){
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