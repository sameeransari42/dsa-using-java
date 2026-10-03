package Recursion;

import java.util.Arrays;

public class SortingRecursion {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
//        bubble(arr, );
//        selection(arr, arr.length-1, 0,0);
//        System.out.println(Arrays.toString(arr));
//        cyclic(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));

        int[] newArr = mergeSort(arr);
        System.out.println(Arrays.toString(newArr));

//        mergeSortInPlace(arr, 0, arr.length);
//        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    // Quick Sort
    public static void quickSort(int[] arr, int first, int last){
        if (first >= last){
            return;
        }
        int s = first;
        int e = last;
        int m = s + (e- s)/2;
        int pavit = arr[m];

        while (s <= e){
            while (arr[s] < pavit){
                s++;
            }
            while (arr[e] > pavit){
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
        quickSort(arr, first, e);
        quickSort(arr, s, last);
    }

    // In- Place Merge Sort
    public static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1){
            return;
        }
        int mid = (e+s)/2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, arr.length);

        mergeInPlace(arr, s, mid, e);
    }
    public static void mergeInPlace(int[] arr, int s, int mid, int e){
        int[] mix = new int[e-s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++){
            arr[s+l] = mix[l];
        }
    }

    // Merge Sort
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    public static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
    // Cyclic Sort
    public static void cyclic(int[] arr, int s, int e){
        int correct = arr[s]-1;
        if (s == e){
            return;
        }

        if (s <= e){
            if (arr[s] == arr[correct]){
                cyclic(arr, s+1, e);
            }else {
                int temp = arr[correct];
                arr[correct] = arr[s];
                arr[s] = temp;
                cyclic(arr, s, e);
            }
        }
    }


    // Selection Sort
    private static void selection(int[] arr, int r, int c, int max) {
        if (r == 0){
            return;
        }
        if (c < r){
            if (arr[max] < arr[c]){
                max = c;
            }
            selection(arr, r, c+1, max);

        }else{
            int temp = arr[r];
            arr[r] = arr[max];
            arr[max] = temp;
            selection(arr, r-1, 0, 0);
        }
    }

    // using the recursion sort the array with the help of bubble sort.
    private static void bubble(int[] arr, int r, int c) {
        if (r == 0){
            return;
        }
        if (c < r){
            if (arr[c] > arr[c+1]){
                int temp = arr[c+1];
                arr[c+1] = arr[c];
                arr[c] = temp;
                bubble(arr, r, c+1);
            }
            bubble(arr, r, c+1);
        }else{
            bubble(arr, r-1, 0);
        }

    }
}
