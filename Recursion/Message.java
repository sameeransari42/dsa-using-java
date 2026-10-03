package Recursion;

public class Message {
    public static void main(String[] args) {
//        message();
        numberExample(1);
    }
    public static void message(){
        System.out.println("Hello, World!");
        message2();
    }
    // print message using recursion.
    static void message2(){
        System.out.println("Hello, World!");
        message3();
    }

    static void message3(){
        System.out.println("Hello, World!");
        message4();
    }

    static void message4(){
        System.out.println("Hello, World!");
        message5();
    }

    static void message5(){
        System.out.println("Hello, World!");
    }

    // print numbers 1-5 using recursion.
    static void numberExample(int n){
        System.out.println(n);
        numberExample2(2);
    }

    static void numberExample2(int n){
        System.out.println(n);
        numberExample3(3);
    }

    static void numberExample3(int n){
        System.out.println(n);
        numberExample4(4);
    }

    static void numberExample4(int n){
        System.out.println(n);
        numberExample5(5);
    }

    static void numberExample5(int n){
        System.out.println(n);
    }
}
