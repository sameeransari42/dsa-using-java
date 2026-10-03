package Java_Concept.LinearSearch;

public class Problems {
    public static void main(String[] args) {
//        int[][] arr = {
//                {45, 89, 23},
//                {90, 29, 86},
//                {30, 48, 9},
//        };
//        int[] nums = {12, 335, 2, 6, 7899};
//        System.out.println(Even(nums));

        int[][] arr = {
                {1, 2, 3},
                {1, 3, 2},
        };
        CheckWealth(arr);

//        Min(arr);
    }

    //    static void Min(int[] arr){
//        if (arr.length == 0){
//            System.out.println("Array is empty");
//        }
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println(min);
//    }
//    static void Min(int[][] arr) {
//
//        int min = 86;
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col] == min) {
//                    System.out.println(Arrays.toString(new int[]{row, col}));
//                }
//            }
//        }
//    }

    /*
    Given an array nums of integers, return how many of them contain an even numbers of digits.
    Leet code question.
     */
//    static int Even(int[] arr){
//        int count = 0;
//        for (int element : arr){
//            if (even(element)){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    static boolean even(int num){
//        int numberOfDigits = digits(num);
//
//        return numberOfDigits % 2 == 0;
//    }
//
//    static int digits(int ele){
//        int count = 0;
//        while (ele > 0){
//            ele = ele/10;
//            count++;
//        }
//        return count;
//    }
    // Leet Code Problem: Richest Customer Wealth.

    static void CheckWealth(int[][] arr){

        for (int row = 0; row < arr.length; row++){
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++){
                sum = sum + arr[row][col];
            }
            System.out.println(sum);
        }
    }
}
