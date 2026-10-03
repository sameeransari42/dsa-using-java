package Java_Concept.Basic;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String DP = input.next();
        int Emp = input.nextInt();

        switch (Emp){
            case 1:
                System.out.println("Sameer Ansari");
                break;
            case 2:
                System.out.println("Rahul Kumar");
                break;
            case 3:
                System.out.println("Ashish Sharma");
                switch (DP){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "MD":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Please Enter Right input");
                        break;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Emp);
        }
    }
}
