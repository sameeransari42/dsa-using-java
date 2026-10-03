package Java_Concept.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        System.out.println(arr[0]);
        // Output: 0

//        String[] str = new String[4];
//        System.out.println(str[0]);
        // Output: null
        int[] arr = new int[5];

        // input
        for (int i = 0; i <arr.length; i++){
            arr[i] = in.nextInt();
        }
        // output
        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
        // output
        System.out.println(Arrays.toString(arr));
    }
}
