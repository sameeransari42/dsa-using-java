package PatternProblems;

public class Problems {
    public static void main(String[] args) {
        PatternProblems(5);

    }

    private static void PatternProblems(int n) {
        for (int i = 1; i <= n; i++){

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n-i); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0 ; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }



//        for (int i = 0; i <= 5; i++){
//            for (int j = 1; j <= 6 - i; j++){
//                System.out.print(1+i + " ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j <= i; j++){
//                System.out.print((char)('E' + j - i) + " ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < 5 - i; j++){
//                System.out.print((char)('E' - j - i) + " ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j <= i; j++){
//                System.out.print((1 - j + i) + " ");
//            }
//            System.out.println();
//        }
    }
}
