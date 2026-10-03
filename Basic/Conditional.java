package Java_Concept.Basic;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
//        int salary = 20000;

//        if (salary > 10000){
//            salary += 2000;
//        }else{
//            salary += 1000;
//        }
//        System.out.println(salary);

        // Multiple Statements
        System.out.print("Please enter what is your salary: ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();

        if (salary >= 20000){
            salary += 1000;
        }else if(salary >15000){
            salary += 2000;
        }else{
            salary += 3000;
        }
        System.out.println("Now your salary is: " + salary);
        }
    }

