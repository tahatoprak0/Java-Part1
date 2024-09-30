package dizi_odevler.stack_gerceklestirmesi;

import java.util.Arrays;

public class Stack {
    public static final int MAX_STACK_SİZE = 5;
    public static String[] array = new String[MAX_STACK_SİZE];
    public static boolean full = false;
    public static boolean empty = true;
    public static int pointer = 0;


    public boolean push(String newElement) {
        if (!full) {
            array[pointer] = newElement;
            pointer++;
            empty = false;
            if (pointer == MAX_STACK_SİZE) {
                full = true;
            }
            return true;
        } else return false;

    }

    public String pop() {
        String lastItem = null;
        if (!empty) {
            lastItem = array[pointer - 1];
            array[pointer-1]=null;
            pointer--;

            if (pointer != MAX_STACK_SİZE) {
                full = false;
            }
            if (pointer == 0) {
                empty = true;
            }
        }

        return lastItem;
    }

    public void clear() {
        Arrays.fill(array, null);
        pointer = 0;
        empty = true;
        full = false;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isFull() {
        return full;
    }

    public int size() {
        return pointer ;
    }

    public int getCapacity() {
        return MAX_STACK_SİZE;
    }

    public void showElements() {
        for (String s:array){
            System.out.println(s);
        }
    }

}
