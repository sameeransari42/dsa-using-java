package OOPs.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle cir = new Circle();

        Shapes tri = new Triangle();
//        tri.area();


        Animal dog = new Dog();
//        dog.sound();

        dog.sound();
    }
}
