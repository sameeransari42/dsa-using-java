package Java_Concept.Functions;

import java.util.Arrays;

public class Modify_Value {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        Change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void Change(int[] num){
        num[0] = 90;
    }
}
