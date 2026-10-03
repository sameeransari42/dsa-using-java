package Recursion;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

        int[][] path = new int[arr.length][arr[0].length];

        maze("", arr, path, 0, 0, 1);
    }

    public static void maze(String p, boolean[][] maze, int[][] path, int r, int c, int count){
        if (r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = count;
            for (int[] i : path){
                System.out.println(Arrays.toString(i));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = count;

        if (r < path.length-1){
            maze(p + "D", maze, path, r+1, c, count+1);
        }

        if (c < path[0].length-1){
            maze(p + "R", maze, path, r, c+1, count+1);
        }

        if (r > 0){
            maze(p + "U", maze, path, r-1, c, count+1);
        }

        if (c > 0){
            maze(p + "L", maze, path, r, c-1, count+1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
//    boolean[][] arr = {
//            {true, true, true},
//            {true, true, true},
//            {true, true, true},
//    };
//
//    int[][] path = new int[arr.length][arr[0].length];
//    allSteps("", arr, 0, 0, path, 1);

//
//    public static void allSteps(String p, boolean[][] maze, int r, int c, int[][] path, int count){
//        if (r == maze.length-1 && c == maze[0].length-1){
//            path[r][c] = count;
//            for (int[] i : path){
//                System.out.println(Arrays.toString(i));
//            }
//            System.out.println(p);
//            System.out.println();
//            return;
//        }
//        if (!maze[r][c]){
//            return;
//        }
//        maze[r][c] = false;
//        path[r][c] = count;
//        if (r < 2){
//            allSteps(p + "D", maze, r+1, c, path, count+1);
//        }
//        if (c < 2){
//            allSteps(p+"R", maze, r, c+1, path, count+1);
//        }
//        if (r > 0){
//            allSteps(p + "U", maze, r-1, c, path, count+1);
//        }
//
//        if (c > 0){
//            allSteps(p + "L", maze, r, c-1, path, count+1);
//        }
//
//        maze[r][c] = true;
//        path[r][c] = 0;

//    public static void allPaths(String p, boolean[][] maze, int r, int c){
//        if (r == maze.length-1 && c == maze[0].length-1){
//            System.out.println(p);
//            return;
//        }
//        if (!maze[r][c]){
//            return;
//        }
//        maze[r][c] = false;
//
//        if (r < 2){
//            allSteps(p + "D", maze, r+1, c);
//        }
//        if (c < 2){
//            allSteps(p+"R", maze, r, c+1);
//        }
//        if (r > 0){
//            allSteps(p + "U", maze, r-1, c);
//        }
//
//        if (c > 0){
//            allSteps(p + "L", maze, r, c-1);
//        }
//        /*
//        Before the function gets removed also remove the changes that made by that function
//         */
//        maze[r][c] = true;
//    }

}
