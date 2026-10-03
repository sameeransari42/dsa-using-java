package Java_Concept.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // How to declare 2d array

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };

//        int x = in.nextInt();
//        int y = in.nextInt();

        // How to take input

        int[][] arr = new int [3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // How to print output.

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < arr.length; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }
        // Enhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}

