package Java_Concept.Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(1,2, 3, 4, 5, 6, 7, 8, 9, 10); // Variable Length Arguments
        // Mixing Arguments
//        show(23, 12, "Sameer", "Rahul", "Noor");
        demo(12, 23, 45, 32, 13);
       demo("Sameer", "Rajeev");

    }

// Internally it's taking array of integer Array: is the collection of integers.
//    static void fun(int ...v){
//        System.out.println(Arrays.toString(v));
//    }

//    static void show(int a, int b, String ...v){
//        System.out.println();
//    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
