package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        // Add elements
        myList.add(12);
        myList.add(2);
        myList.add(10);
        myList.add(15);
        myList.add(8);
        myList.add(20);

        // add the element at a particular index
        myList.add(1, 100);
        System.out.println(myList);

        // Get element of the index
        int find = myList.get(3);
        System.out.println(find);

        // replace the value
        myList.set(3, 150);
        System.out.println(myList);

        // remove the element from the list
        myList.remove(1);
        System.out.println(myList);

        // get the length of the list
        System.out.println(myList.size());

        //
        Collections.sort(myList);
        System.out.println(myList);
    }
}
