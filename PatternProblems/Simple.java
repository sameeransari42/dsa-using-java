package PatternProblems;

public class Simple {
    public static void main(String[] args) {
        simple(5);
    }

    public static void simple(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-1; j++){
                System.out.print("");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        /*for (int i = 0; i < 5; i++){
            for (int j = 1; j < 5 - i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }*/

        /*for (int i = 0; i < n; i++){
            for (int j = 1; j < n - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*for (int row = 0; row < n; row++){
            for (int col = 0; col < row + 1; col++){
                System.out.print(col + 1+" ");
            }
            System.out.println();
        }*/

        /*for (int row = 1; row <= 2 * n; row ++){
            int Cols = row > n ? 2 * n - row: row;

            int spaces = n - Cols;
            for (int s = 0; s < spaces; s++){
                System.out.print(" ");
            }
            for (int col = 0; col < Cols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*for (int row = 1; row <= n; row ++){
            int spaces = n - row;

            for (int s = 1; s <= spaces; s++){
                System.out.print(" ");
            }
            for (int col = 1; col <= n-spaces; col++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for (int row = n; row > 0; row --){
            int spaces = n - row;

            for (int s = 1; s <= spaces; s++){
                System.out.print("  ");
            }
            for (int col = n-spaces; col > 0; col--){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int s = 1; s <= spaces; s++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }*/
        /*for (int row = 1; row <= 2 * n; row++) {
            int c = row > n? 2 * n - row: row;
            int spaces = n - c;
            for (int s = 1; s <= spaces; s++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }*/
        /*int originalN = n;
        n = n * 2;
        for (int row = 0; row <= n; row++){
            for (int col = 0; col <= n; col++){
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n-col, n-row));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }*/

    }
}
