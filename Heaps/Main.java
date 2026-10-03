package Heaps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

        RevisionBuildHeap rev = new RevisionBuildHeap();

        rev.insert(2);
        rev.insert(4);
        rev.insert(6);
        rev.insert(15);
        rev.insert(10);

        System.out.println(rev.remove());
        System.out.println(rev.remove());
        System.out.println(rev.list);
    }
}
