package Java_Concept.Functions;

public class Overloading {
    public static void main(String[] args) {
        fun(20);
    }

    /*
     Two or more function with the same name they can exist but the no. of parameters
     should be different and the type should be.
     */

    static void fun(int num){
        System.out.println(num);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
