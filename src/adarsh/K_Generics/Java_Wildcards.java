package adarsh.K_Generics;

import java.util.Arrays;

public class Java_Wildcards<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public Java_Wildcards() {

        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args) {
        // Java_Wildcards<String> list = new Java_Wildcards<>(); // not possible => bounded with 'number' class
        Java_Wildcards<Integer> list = new Java_Wildcards<>();
        list.add(23);
        System.out.println(list);

    }
}