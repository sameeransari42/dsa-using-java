package LinkedList;

public class MainQs {
    public static void main(String[] args) {
        Qs list = new Qs();

        Qs list1 = new Qs();
        Qs list2 = new Qs();


        list1.insert(1);
        list1.insert(2);
        list1.insert(4);

        list2.insert(1);
        list2.insert(3);
        list2.insert(4);

        Qs ans = list.merge(list1, list2);
        ans.display();

    }
}
