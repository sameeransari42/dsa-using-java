package Strings;

public class Main {
    public static void main(String[] args) {
       /*
       Data type of String is a class of String Java.
       Every String that you create is actually an object of type String.

       Concept: String Pool, Immutability

       String Pool: string pool is nothing but separate memory structure inside the heap
       Use case: All the similar values of string are like not recreated in the pool, create our program more optimize.
       Immutability: Strings in java are immutable because of security reason.

       How to create different object for same value.
       When you only need to check value use (.equals) method?
       NOte: Whatever you put in println does not matter which data type in the end in the end it's going to string only.
        */

        String name1 =  new String("Sameer");
        String name2 = new String("Sameer");

        int num = 10;
        String name = "Sameer";

        System.out.println(new int[] {4, 3, 2, 1});
    }

}
