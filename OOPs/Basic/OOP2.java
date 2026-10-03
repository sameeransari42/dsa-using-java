package OOPs.Basic;

public class OOP2 {
    public static void main(String[] args) {
//        Humen sameer = new Humen(19, "sameer", 15000, false);
//        System.out.println(Humen.population);

//        hello();
    }

    static void hello(){
        OOP2 obj = new OOP2();

        obj.greetings();
    }

    void greetings(){
        System.out.println("i'm greeting");
    }
}

class Humen{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Humen(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Humen.population = 10;
    }

    static void show(){
//        System.out.println(this.name);  we can't acces those variable who depends on the object inside those who doesn't depend on the object.
    }
}


