package BinarySearch;

public class Main {
    public static void main(String[] args) {


//        int[] arr = {0, 1, 2, 3, 4, 5, 6};
//        int ans = binarySearch(arr, 2);
//        System.out.println(ans);

        // searching in descending order.
        int[] arr = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        int ans = binarySearch(arr, 20);
        System.out.println(ans);

    }

//    static int binarySearch(int[] arr, int ele){
//        if (arr.length == 0){
//            return -1;
//        }
//        int start = 0;
//        int end = arr.length - 1;
//
//        // just because of sorted array.
//        while (start <= end){
//
//            int mid = start + (end - start)/2;
//
//            if (ele < arr[mid]){
//                end = mid -1;
//            } else if (ele > arr[mid]) {
//                start = mid + 1;
//            }else {
//                return mid;
//            }
//
//        }
//        return -1;
//    }

    static int binarySearch(int[] arr, int ele) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > ele) {
                start = mid + 1;
            } else if (arr[mid] < ele) {
                end = mid -1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

 /*
        Step 1: Find the middle element
        Note: Array should be Sorted array.

        Step 2: Target > Middle Search on the right side
                otherwise search in left side.

        Search Space: the space in which I'm searching the space is getting divided by 2.

        Step 3: if middle element == target element --> ans
        Step 4: if start > end --> element does not exist in the array.

        Q: Why we do binary search.
        Ans:

        Q: Best case.
        Ans: find the maximum number of search comparison in the worst case.

        Q: Worst case.
        Ans: Now, k is basically the total number of level is in the worst case.
            because in the worst case you will keep checking till the last element only one
            element is remaining you will be found the element you will not.

         So, the total number of levels total number of comparison is in the worst case how much log(N).
         where N is the size of the array.


         */