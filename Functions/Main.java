/*
In Java functions known as Method because in java everything put inside the class
    If you make a change to the object via this reference variable same obj will be changed.
 */

package Java_Concept.Functions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String name = "Rahul";
//        Swap(name);
        int[] arr = {1, 2, 3, 4, 5};
        Change(arr);
        System.out.println(Arrays.toString(arr));


    }

//    static void Swap(String naam){
//        naam = "Sameer";
//        System.out.println(naam);
//    }
    static void Change(int[] num){
        num[0] = 90;
    }
}

