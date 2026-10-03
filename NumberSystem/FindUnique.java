package NumberSystem;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 4, 2, 3, 4, 3};
        System.out.println(uniqueValue(arr));
    }

    private static int uniqueValue(int[] arr) {
        int unique = 0;
        for (int n : arr){
            unique ^= n;
        }
        return unique;
    }

}
