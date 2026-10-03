package Java_Concept.Functions;

public class Shadowing {
    static int x = 50; // Object independent   // This will be shadowed at line 9
    public static void main(String[] args) {

        System.out.println(x);

        int x = 15; // Lower level overwrite the upper level
        System.out.println(x);

        fun();
    }
     static void fun(){
         System.out.println(x);
     }
}
