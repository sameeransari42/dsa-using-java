package OOPs.Abstraction;

public class Son extends Parent{

    Son(){
        super("Rabiya");
    }

    @Override
    void career() {
        System.out.println("I'm going to be Engineer");
    }

    @Override
    void partner() {
        System.out.println("I love Iqra");
    }
}