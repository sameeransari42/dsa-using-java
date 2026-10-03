package Basic;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        forEach Loop**
        Enhanced Loop**

        For loop syntax:
            for (initialisation; condition; increment/decrement){
            body
            Note: Use for loop when you know how many times the loop is going to run.
         */
//        for (int i = 1; i <= 10; i ++){
//            System.out.println(i);
//        }

//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//
//        for (int n = 1; n <= num; n++) {
//            System.out.println(n);
//        }

        // use while loop when you don't know how many times the loop is going to run.

//        int n = 1;
//        while (n <= 10){
//            System.out.println(n);
//            n+=1;
//        }

        // do while loop execute at least once after that it will execute only when the condition is met.
        int n = 1;
        do {
            System.out.println("Hello world");
        } while(n != 1);

    }
}