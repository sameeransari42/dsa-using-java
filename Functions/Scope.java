package Java_Concept.Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
//        Change(a, b);
//        System.out.println(a);
//        System.out.println(b);
        {
            a = 100;
            int c = 200;
            System.out.println(a);
        }
        int c = 100;
        System.out.println(a);
        System.out.println(c);
    }

//    static void Change(int x, int y){
//        int temp = x;
//        x = y;
//        y = temp;
//        System.out.println(x);
//        System.out.println(y);
//    }

    // This change will only be valid in this  function scope only.

    /*
    In primitives data types the value will be passed hence the original value
    is not the change.

    In other data types like non primitives data types arr, stuff it also
    pass by value passing the value of the reference variable if you make
    change via that the original object will be changed.

    1. Anything initialize outside the block you can't initialize that again
    inside the block, but you can access and modify that.

    2. Anything initialize inside the block you can initialize that again outside the block, but you can't access
    inside variable outside the block.
     */

}
