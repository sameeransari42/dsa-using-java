package Heaps;

import java.util.ArrayList;

public class RevisionBuildHeap {
    public ArrayList<Integer> list;

    public RevisionBuildHeap() {
        list = new ArrayList<>();
    }

    public void insert(int val) {
        list.add(val);
        upheap(list.size() - 1);
    }

    public int remove() {
        int top = list.get(0);
        int last = list.removeLast();

        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }

        return top;
    }

    private void upheap(int index) {
        if (index == 0) return;

        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
    }

    private void downheap(int index) {
        int min = index;

        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if (min != index) {
            swap(min, index);
            downheap(min);
        }
    }

    private void swap(int f, int s) {
        int temp = list.get(f);
        list.set(f, list.get(s));
        list.set(s, temp);
    }



    private int parent(int index) {
        return (index - 1) / 2;
    }
    private int left(int index) {
        return (2 * index + 1);
    }
    private int right(int index) {
        return (2 * index + 2);
    }
}
