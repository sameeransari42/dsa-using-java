package OOPs.Interfaces;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 9;
        int b = 0;



        try {
            divide(a, b);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This will always execute");
        }
    }
    static int divide(int a, int b){
        if (b == 0){
            throw  new ArithmeticException("Please do not divide by zero");
        }

        return a / b;
    }
}
