package LinearSearch;

public class SearchInteger {
    public static void main(String[] args) {
        int[] arr = {23, 12, 24, 5, 4, 8, 67, 34, 46};
        int target = 617;
        int ans = linearSearch(arr, target);
        System.out.println(ans);

    }
    // search in the array return the index if the item fount
    // otherwise if item not fount return -1
//    static int linearSearch(int[] arr, int ele){
//        if (arr.length == 0){
//            return -1;
//        }
//        //run a for loop
//        for (int idx = 0; idx < arr.length; idx++){
//            // check for every element at every index if it is = target
//            int target = arr[idx];
//            if (target == ele){
//                return idx;
//            }
//        }
//        return -1;
//    }

    // Search in the array and return the value

    static int linearSearch(int[] arr, int ele){
        if (arr.length == 0){
            return -1;
        }

        for (int element : arr){
            if (element == ele){
                return element;
            }
        }
        // this line will execute if none of the return statement above have executed
        // hence the ele not found
        return Integer.MAX_VALUE;
    }

//    static boolean linearSearch(int[] arr, int target) {
//        if (arr.length == 0) {
//            return false;
//        }
//
//        for (int element : arr) {
//            if (element == target) {
//                return true;
//            }
//        }
//        return false;
//    }
}
