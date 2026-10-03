package Recursion;

import java.util.ArrayList;

public class Backtracking {
    public static void main(String[] args) {
        ArrayList list = backtracking("",3, 3);
        System.out.println(list);
    }

    public static ArrayList backtracking(String p, int row, int col) {
        ArrayList<String> list = new ArrayList<>();
        if (row == 1 && col == 1){
            list.add(p);
            return list;
        }

        if (row > 1){
          list.addAll(backtracking(p + "R", row-1, col));
        }

        if (col > 1){
            list.addAll(backtracking(p + "D", row, col-1));
        }

        if (row > 1 && col >1){
            list.addAll(backtracking(p + "d", row-1, col-1));
        }
        return list;
    }
}
