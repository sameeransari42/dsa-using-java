package Heaps;

import java.util.ArrayList;

public class Heaps {
    ArrayList<Integer> list;

    Heaps() {
        list = new ArrayList<>();
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    private void swap(int first, int second) {
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    public void insert(int value) {
        list.add(value);
        upheap(list.size() - 1);
    }

    private void upheap(int index) {
        if (index == 0) {
            return;
        }

        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
    }

    public int remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Removing from the emply list!");
        }

        int temp = list.getFirst();

        int last = list.removeLast();

        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }

        return temp;
    }

    private void downheap(int index) {
        int parent = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(left) < list.get(parent)) {
            parent = left;
        }

        if (right < list.size() && list.get(right) < list.get(parent)) {
            parent = right;
        }

        if (parent != index) {
            swap(parent, index);
            downheap(parent);
        }

//        System.out.println(list.get(parent));
    }

    public ArrayList<Integer> sortedHeap() throws Exception{
        if (list.isEmpty()) {
            return null;
        }

        ArrayList<Integer> data = new ArrayList<>();

        while (!list.isEmpty()) {
            data.add(this.remove());
        }

        return data;
    }
}
