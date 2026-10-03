package OOPs.Abstraction;

public class Daughter extends Parent{
    Daughter(){
        super("Sana");
    }
    @Override
    void career(){
        System.out.println("I'm going to be Doctor");
    }

    @Override
    void partner(){
        System.out.println("I love Sahil");
    }
}
