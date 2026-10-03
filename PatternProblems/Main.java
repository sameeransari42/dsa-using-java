package PatternProblems;

public class Main {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int num) {
        // Problem 1

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Problem 2

//        for (int row = 1; row <= num; row++){
//            for (int col = 1; col<= num; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Problem 3

//        for (int row = num; row > 0; row--){
//            for (int col = 1; col <= row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Problem 4
//
//        for (int row = 1; row <= num; row++){
//            for (int col = 1; col<= row; col++){
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }

        // Problem 5
//        for (int row = 1; row <= num; row++){
//            for (int col = 1; col <= row; col++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//
//            if (row == num){
//                for (int i = num-1; i > 0 ; i--){
//                    for (int col = 1; col <= i; col++){
//                        System.out.print("* ");
//                    }
//                    System.out.println();
//                }
//            }
//        }


        // Problem 6

//        for (int row = 1; row <= 3; row++){
//            for (int col = 1; col<= 3; col++){
//                if (col == 3){
//                    System.out.println("* ");
//                }else {
//                    col++;
//                }
//            }
//            System.out.println();
//        }
    }
}

