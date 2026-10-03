package Recursion;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);

    }
    public static void dice(String p, int num){
        if (num == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= num; i++) {
            dice(p + i, num-i);
        }
    }
}
