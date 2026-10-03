package OOPs.Interfaces.Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human human = new Human(23, "Sameer");
//        Human twin = new Human(human);

        Human twin = (Human)human.clone();

//        System.out.println(twin.name);
//        System.out.println(twin.age);

        twin.name = "Nivea";

        System.out.println(human.name);
    }
}
