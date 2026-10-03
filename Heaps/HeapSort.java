package Heaps;

import java.util.ArrayList;

public class HeapSort {
    ArrayList<Integer> list;

    public HeapSort() {
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

    private void insert(int[] arr, int index) {
        list.add(arr[index]);
        upheap(arr, list.size() - 1);
    }

    private void upheap(int[] nums, int index) {
        if (index == 0) {
            return;
        }

        int parent = parent(index);
        if (list.get(parent) < list.get(index)) {
            swap(parent, index);
            upheap(nums, parent);
        }
    }

    private int remove() {
        int temp = list.get(0);

        int last = list.remove(list.size() - 1);

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

        if (left < list.size() && list.get(parent) < list.get(left)) {
            parent = left;
        }

        if (right < list.size() && list.get(parent) < list.get(right)) {
            parent = right;
        }

        if (parent != index) {
            swap(parent, index);
            downheap(parent);
        }
    }

    public int[] heapSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums, i);
        }

        int[] arr = new int[nums.length];
        int j = arr.length - 1;
        while (!list.isEmpty()) {
            arr[j] = this.remove();
            j--;
        }

        return arr;
    }
}
