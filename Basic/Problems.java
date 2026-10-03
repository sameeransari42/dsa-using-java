package Java_Concept.Basic;

import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// find the largest in three numbers

//        float num1 = input.nextInt();
//        float num2 = input.nextInt();
//        float sum = num1+num2;
//        System.out.println("Sum is: "+ sum);


//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();

//        int max = num1;
//        if (num2 > max) {
//            max = num2;
//        }
//        if (num3 > max){
//            max = num3;
//        }
//        System.out.println(max);

//        int max = Math.max(c, Math.max(a, b));
//        System.out.println(max);

        // Check given character is upper case or lower

//        char al = input.next().trim().charAt(1);
//        System.out.println(al);

//        int val = al;
//        System.out.println(val);
//
//        if (al >= 97){
//            System.out.println("lower case");
//        }else{
//            System.out.println("Upper case");
//        }
//        if (al >= 'a' && al <= 'z'){
//            System.out.println("lower case");
//        }else {
//            System.out.println("upper case");
//        }

        // Fibonacci Series
//        int fib = 7;
//        int f1 = 0;
//        int f2 = 1;
//
//        int count = 2;
//
//        System.out.println(f1);
//        System.out.println(f2);
//
//        for (int n = 0; n <= fib-count; n++){
//            int f = f1+ f2;
//            f1 = f2;
//            f2 = f;
//
//            System.out.println(f);
//        }

        // Check how many times a number is occurring.

//        int n = 845884;
//        int count = 0;
//
//        while (n > 0) {
//            int rem = n % 10;
//            if (rem == 8) {
//                count++;
//            }
//            n /= 10;
//        }
//        System.out.println(count);
//
        // Find the reverse of the number.
//        int n = 18487;
//        int ans = 0;
//        while(n > 0){
//            int rem = n % 10;
//            n /= 10;
//
//           ans =  ans * 10 + rem;
//        }
//        System.out.println(ans);

        // Design Calculator
        while (true) {

            float ans = 0;
            System.out.print("Enter Operation(Q for: Quit): ");
            char op = input.next().trim().charAt(0);

            if (op == 'Q' || op == 'q'){
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/') {

                float n1 = input.nextFloat();
                float n2 = input.nextFloat();

                if (op == '+') {
                    ans = n1 + n2;
                } else if (op == '-') {
                    ans = n1 - n2;
                } else if (op == '*') {
                    ans = n1 * n2;
                } else {
                    ans = n1 / n2;
                }
            } else {
                System.out.println("You Chosen wrong input.");
            }
            System.out.println(ans);
        }
        System.out.println("End");
    }
}
