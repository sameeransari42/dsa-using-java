package Recursion;

public class MazeObstacles {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };

        baze("", arr, 0, 0);
    }
    public static void baze(String p, boolean[][] baze, int r, int c){
        if (r == baze.length-1 && c == baze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!baze[r][c]){
            return;
        }
        if (r < 2){
            baze(p + "D", baze, r+1, c);
        }
        if (c < 2){
            baze(p+"R", baze, r, c+1);
        }
    }
}
