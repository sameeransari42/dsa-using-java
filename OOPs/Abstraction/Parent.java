package OOPs.Abstraction;

public abstract class Parent {

    String name;
    static long value;

    Parent(String name){
        this.name = name;
        Parent.value = 8473L;
    }

    abstract void career();
    abstract void partner();

    static void hello(){
        System.out.println("hello!");
    }
}
