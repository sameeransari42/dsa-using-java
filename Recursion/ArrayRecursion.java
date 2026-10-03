package Recursion;

import java.util.ArrayList;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 7, 7, 8};
//        System.out.println(checkSorted(arr, 0));
//        System.out.println(findIndex(arr, 0, 1));

//        findIndex(arr, 0, 34);
//        System.out.println(myList);

//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(findAllIndices(arr, 0, 10, list));
        System.out.println(findIndex2(arr, 0, 7));

//        System.out.println(findEleBinray(arr, 3, 0, arr.length));

    }
    // find the element using binary search -> it's not correct it has somewhere error
    private static int findEleBinray(int[] arr, int target, int s, int e) {
        if (s > e){
            return -1;
        }
        int m = s + (e - s)/2;

        if (arr[m] == target){
            return m;
        }
        if (arr[s] <= arr[m]){
            if (target >= arr[s] && target <= arr[m]){
                return findEleBinray(arr, target, s, m-1);
            }else {
                findEleBinray(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= e){
            return findEleBinray(arr, target, m+1, e);
        }
        return findEleBinray(arr, target, s, m-1);
    }

    private static ArrayList findIndex2(int[] arr, int i, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        if (i == arr.length){
            return list;
        }

        if (arr[i] == target){
            list.add(i);
        }

        ArrayList belowAns = findIndex2(arr, i+1, target);
        list.addAll(belowAns);
        return list;
    }
    // return the indices of the elemnet if they are exist in the array, arraylist should not declare outside the method.
    

    // check whether the element exist or not in the array if then return index.
    private static ArrayList findAllIndices(int[] arr, int i, int target, ArrayList list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target){
            list.add(i);
        }
        return  findAllIndices(arr, i+1, target, list);

    }

    // check whether the element exist or not in the array if then return index.
    private static int findIndex(int[] arr, int i, int target) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == target){
            return i;
        }

        return  findIndex(arr, i + 1, target);

    }

    // check whether the element exist or not in the array.
    private static boolean findElement(int[] arr, int i, int target) {
        if (i == arr.length) {
            return false;
        }
        return arr[i] == target || findElement(arr, i + 1, target);
    }

    // Check whether the array sorted or not.
    private static boolean checkSorted(int[] arr, int i) {
        if (i == arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && checkSorted(arr, i+1);
    }
}
