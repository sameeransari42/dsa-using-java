package OOPs.Basic;

// we can't make outer class as static?
class MoreInner {
    String name;

    MoreInner(String name) {
        this.name = name;
    }
}

class InnerClass {

    public static void main(String[] args) {

        MoreInner ob = new MoreInner("Sameer");
        MoreInner ob1 = new MoreInner("Rohan");

        System.out.println(ob.name);
        System.out.println(ob1.name);
    }
}
