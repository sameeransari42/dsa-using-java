package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int default_size = 10;
    private int idx = 0;

    public CustomArrayList(){
        this.data = new int[default_size];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[idx++] = num;
    }

    private boolean isFull(){
        return idx == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public int remove(){
        int removed = data[--idx];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return idx;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        CustomArrayList list1 = new CustomArrayList();

        list.add(12);
        list.add(15);
        list.add(19);
//        list.remove();

        list1.add(10);

//        System.out.println(list);
//        System.out.println(list1);


        list.add(89);
        list.add(14);
        list.add(78);
        list.add(56);
//        System.out.println(list.remove());
        list.add(89);
        list.add(345);
        list.add(783);
        list.add(526);
        System.out.println(list);
    }
}
