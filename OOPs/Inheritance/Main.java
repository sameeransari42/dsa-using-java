package OOPs.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Box box2 = new Box (box);
//        System.out.println(box2.l + " " + box2.w + " " + box2.h + " ");

        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.h);

        BoxWeight box4 = new BoxWeight(3, 4, 5, 6);
//        System.out.println(box4.l + " " + box4.w + " " + box4.h + " " + box4.weight + " ");

//        BoxWeight box7 = new BoxWeight(4, 6);
//        System.out.println(box7.l);


        Box box5 = new BoxWeight(2, 3, 4, 5);

        BoxWeight box6 = new BoxWeight(box4);
//        System.out.println(box6.w);

        BoxWeight boxwt = new BoxWeight(7, 10);

//        BoxWeight box6 = new Box(2, 3, 4);

//        BoxWeight box7 = new Box(3, 4, 5);
//

        BoxPrice boxpr = new BoxPrice(8, 9, 11);
        System.out.println(boxpr.cost);

    }
}


