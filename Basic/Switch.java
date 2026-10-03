package Basic;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myName = input.next();

//        switch (fruit){
//            case "Mango":
//                System.out.println("King of fruit");
//                break;
//            case "Apple":
//                System.out.println("Red Fruit");
//                break;
//            case "Grapes":
//                System.out.println("Sweet & Sour");
//                break;
//            default:
//                System.out.println("Please enter right input");
//        }

        // this is more clear and good.

//        switch (fruit){
//            case "Mango" -> System.out.println("Kings of fruit");
//            case "Grapes" -> System.out.println("Sweet and sour");
//            case "Orange" -> System.out.println("Beautiful fruit");
//            case "Apple" -> System.out.println("A red Fruit");
//
//            default -> System.out.println("Please Enter right input");
//        }
//
//        int day = input.nextInt();
//
//        switch (day){
//
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
//            case 6, 7 -> System.out.println("Weekend");
//        }

        switch (myName) {
            case "Sameer" -> System.out.println("You are a good boy.");
            case "Fraz" -> System.out.println("You are not a good boy.");

        }
    }
}



/*
Notes: 1 Cases have to be the same type expressions, must be a constant or literal
        2 duplicates case values are not allowed
        3 break is the use to terminate the sequence
        4 if break is not used, it will continue to the next case
        5 default will execute  when none  of the above does
        6 if default is not at the end put break after it
 */