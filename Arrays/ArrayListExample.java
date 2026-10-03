package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(45);
//        list.add(452);
//        list.add(25);
//        list.add(55);
//        list.add(45);
//        list.add(451);
//        list.add(435);
//        list.add(4645);
//        list.add(10);

//        System.out.println(list);
//        System.out.println(list.contains(34));
        // change
//        list.set(2, 500);
//        System.out.println(list);

        // remove
//        list.remove(5);
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }
        // get the input
        for (int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }
//        System.out.println(list);
//        System.out.println(list.get(1));
    }
}
