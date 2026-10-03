package PatternProblems;

import java.util.Arrays;

public class PatternWithRecursion {
    public static void main(String[] args) {
//        Triangle(0, 0);
//        bubble(arr, arr.length-1, 0);
//        System.out.println(Arrays.toString(arr));

    }

    // print the triangle pattern
    private static void Triangle(int r, int c){
        if (r == 4){
            return;
        }
        if (c <= r){
            System.out.print("* ");
            Triangle(r, c+1);
        }else {
            System.out.println();
            Triangle(r+1, 0);
        }
    }

}
