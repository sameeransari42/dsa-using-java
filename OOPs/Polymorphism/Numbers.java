package OOPs.Polymorphism;

public class Numbers {

    int sum (int a, int b){
        return a + b;
    }

    int sum (int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers sum = new Numbers();

        int ans = sum.sum(4, 2);
        System.out.println(ans);
    }

}

