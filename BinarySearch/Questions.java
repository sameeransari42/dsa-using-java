package Java_Concept.BinarySearch;

public class Questions {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 23, 37, 45, 47, 50};
//        int ans = Ceiling(arr, 8);
//        System.out.println(floor(arr, 26));
//        char[] str = {'c', 'e', 'i', 'l', 'n', 'p', 'r', 't', 'w'};
//        char ans = findLetter(str, 'z');
//        System.out.println(ans);

    }
/*
Q. 1: Find the smallest number that which is greater than and equal to the largest element for given array.
Q. 2: Find the floor of a number. --> the biggest number smaller than equal to the target number
Q. 3: Find the smallest letter that is greater than the target.

 */
//    static int Ceiling(int[] arr, int target){
//        if (arr.length == 0){
//            return -1;
//        }
//        int start = 0;
//        int end = arr.length -1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target > arr[mid]) {
//                start = mid + 1;
//            } else if (target < arr[mid]) {
//                end = mid - 1;
//            }else {
//                return mid;
//            }
//        }
//        return start;
//    }

//    static int floor(int[] arr, int target){
//        if (arr.length == 0){
//            return -1;
//        }
//        int start = 0;
//        int end = arr.length -1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target > arr[mid]) {
//                start = mid + 1;
//            } else if (target < arr[mid]) {
//                end = mid - 1;
//            }else {
//                return mid;
//            }
//        }
//        return arr[end];
//    }

//    static char findLetter(char[] arr, char target){
//
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end){
//            int mid = start + (end - start)/2;
//
//            if (target > arr[mid]){
//                start = mid + 1;
//            }else {
//                end = mid - 1;
//            }
//        }
//        return arr[start% arr.length];
//    }






    
}