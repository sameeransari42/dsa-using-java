package Recursion;

public class GoodConcept {
    public static void main(String[] args) {
        int n = 1;
        printNumber(n);
    }

    private static void printNumber(int n) {
        if (n == 6){
            return;
        }
        printNumber(n + 1);
        System.out.println(n);
    }
}
