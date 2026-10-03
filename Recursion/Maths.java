package Recursion;

public class Maths {
    public static void main(String[] args) {
        int n = 302038010;
        int target = 0;
//        int f = 0;
//        fun(n);
//        funBoth(n);
//        System.out.println(factNum(n));
//        System.out.println(DigitSum(n));
//        System.out.println(DigitProduct(n));
//        System.out.println(reverseNumber(n));
//        System.out.println(Palindrome(n));
        System.out.println(CountNum(n, target));

    }
    private static int CountNum(int n, int target) {
        int count = 0;
        if (n % 10 == n){
            return n;
        }

        int rem = n % 10;
        if (rem == target){
            count++;
        }
        return count + CountNum(n/ 10, target);
    }

    // Check whether the number is palindrome or not.
//    private static boolean Palindrome(int n) {
//        int reversed = 0;
//        int original = n;
//
//    }
    // Reverse the number.
    private static int reverseNumber(int n) {
        if (n%10 == n){
            return n;
        }
        int rem = n % 10;
        return Integer.parseInt(Integer.toString(rem) + reverseNumber(n / 10));
    }

    // Digit Product
    private static int DigitProduct(int n) {
        if (n%10 == n){
            return n;
        }
        return (n % 10) * (DigitProduct(n / 10));
    }

    // Sum Of Digits -- For an indivisual digit take remainder by 10.
    private static int DigitSum(int n) {
        if (n == 0){
            return 0;
        }
        return (n%10) + DigitSum(n / 10);
    }

    // find factorial using java
    private static int factNum(int n) {
        int f = 1;
        // base condition
        if (n == 1) {
            return 1;
        }
        return n * factNum(n - 1);
    }
}
