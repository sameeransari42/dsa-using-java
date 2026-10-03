package NumberSystem;

public class FactorOfNumbers {
    public static void main(String[] args) {
        int n = 20;

        System.out.println("Factor of " + n + " is: ");
        getFactors(n);
    }

    private static void getFactors(int n) {
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
