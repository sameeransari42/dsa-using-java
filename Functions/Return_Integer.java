package Java_Concept.Functions;

import java.util.Scanner;

public class Return_Integer {
    public static void main(String[] args) {
       int calculate = sum();
        System.out.println(calculate);
    }
    static int sum(){
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int ans = n1 + n2;
        return ans;
    }
}
