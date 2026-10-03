package OOPs.Basic;
/*
Every class has Object as a super class.
 */
public class OOP1 {
    public static void main(String[] args) {


        Student random = new Student();
        System.out.println(random.name);

        Student  random2 = new Student();
        System.out.println(random2.name);

    }
}

class Student{
    int rollno;
    String name;
    float marks = 90;

    void greetings(){
        System.out.println("Hello! " + name);
    }
    Student(){
        this(23, "default", 99.0f);
    }

    Student(int rol, String naam, float mark){
        rollno = rol;
        name = naam;
        marks = mark;
    }

    Student(Student other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }
}