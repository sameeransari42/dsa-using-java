package OOPs.Interfaces;

public interface Animal {

    int age = 20;

    void eat();
    void sleep();

    // it can only acces via interface name
    static void run(){
        System.out.println("Animal is running");
    }

    // it can only access via animal sub instance name.
    default void random(){
        System.out.println("This is Animal interface");
    }
}
