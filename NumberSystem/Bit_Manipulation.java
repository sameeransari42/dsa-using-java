package NumberSystem;

public class Bit_Manipulation {
    public static void main(String[] args) {
        int  n = 9;
        int position = 0;
        int bitMask = 1<<position;
//        getBit(n, bitMask);
//        System.out.println(setBit(n, bitMask));
//        System.out.println(clearBit(n, bitMask));
        System.out.println(updateBit(n, bitMask));

    }

    private static int updateBit(int n, int bitMask) {
        if ((n & bitMask) == 0){
            return (n | bitMask);
        }else {
            return (n & (~(bitMask)));
        }
    }

//    private static int clearBit(int n, int bitMask) {
//        int convert = ~(bitMask);
//        return (n & convert);
//    }

//    private static int setBit(int n, int bitMask) {
//        return (n | bitMask);
//    }

    // how to get bit.
//    private static void checkNum(int n, int bitMask) {
//        if (((n & bitMask) == 1)){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }
//    }
    // how to set bit.

}
