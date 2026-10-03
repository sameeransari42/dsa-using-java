package Java_Concept.Functions;

import java.util.Scanner;

public class Return_Float {
    public static void main(String[] args) {
        System.out.println(Greet());

    }
    static String Greet(){
        Scanner in = new Scanner(System.in);
        String msg = in.nextLine();

        return msg;
    }
}
