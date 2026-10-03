package Java_Concept.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 21, 45, 23, 75, 343, 122, 48, 495};
        int ans = linearSearch(arr, 3, 9, 45);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr, int start, int end, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int i = start; i < end; i++){
            int element = arr[i];
            if (target == element){
                return i;
            }
        }
        return -1;
    }
}
