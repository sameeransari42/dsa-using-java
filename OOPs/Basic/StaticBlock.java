package OOPs.Basic;

/*
Remember one more thing that outer class can't be static becaue it is not dependent any other class itself.
 */
public class StaticBlock {
    static int n1 = 4;
    static int n2;

    // static block only run once when the first obj is created when the class is loaded for the first time.
    static {
        System.out.println("I'm static");
        n2 = n1 * 5;
    }

    public static void main(String[] args) {

        StaticBlock stb = new StaticBlock();

        System.out.println("a : " + stb.n1 + " b : " + stb.n2);

        stb.n2 += 10;

        StaticBlock stb2 = new StaticBlock();

        System.out.println("a :" + stb2.n1 + " b: " + stb2.n2);
    }

}
