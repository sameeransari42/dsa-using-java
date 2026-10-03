package Recursion;

public class NumberRecursion {
    public static void main(String[] args) {
//        recursion(1);
//        int ans = fib(4);
//        System.out.println(ans);

        int[] arr = {11, 29, 32, 48, 55, 76, 89, 90};
        int ans = search(arr, 89, 0, arr.length-1);
        System.out.println(ans);


    }
    static void recursion(int n){
        // base condition
        if (n == 5){
            System.out.println(n);
            return;
        }
        // body
        System.out.println(n);
        // recursive call
        recursion(n+1);
    }

    // find the fib numbers
    static int fib(int n){
        if (n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    // binary search using recursion
    static int search(int[] arr,int target, int s, int e){
        if (s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target){
            return m;
        }
        if (target < arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }
}
