package NumberSystem;

public class MoreQuestion {
    public static void main(String[] args) {
        int n = 40;
//        System.out.println(isPrime(n));

        System.out.println("The Prime number between "+ 2+ " to "+ n + " are: ");
        for (int i = 2; i < n; i++) {
            if (getAllPrime(i)) {
                System.out.print(i + " ");
            }

        }
    }
    private static boolean getAllPrime(int n) {

        for (int i = 2; i*i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

        // check number prime or not.
    /*private static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }*/

}

