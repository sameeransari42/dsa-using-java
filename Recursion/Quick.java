package Recursion;
import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 8};
        quick(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quick(int[] arr, int low, int high) {
        if (low >= high){
            return;
        }

        int s = low+1;
        int e = high;
        int pivot = arr[low];

        while (s <= e){
            while (s <= high && arr[s] < pivot){
                s++;
            }

            while (e >= low && arr[e] > pivot){
                e--;
            }

            if (s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        if (s > e){
            int temp = arr[e];
            arr[e] = arr[low];
            arr[low] = temp;
        }


        quick(arr, low, e-1);
        quick(arr, s, high);
    }

}
