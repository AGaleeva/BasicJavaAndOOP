package lesson19;

import java.util.Arrays;

public class SmartArray {
    private int size = 0;
    private int[] arr = new int[4];

    public void add(int element) {
        if (size >= arr.length) {
            increaseArray();
        }
        arr[size] = element;
        size++;
    }

    private void increaseArray() {
        int[] tempArray = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i]=arr[i];
        }
        arr = tempArray;
    }

    public String specialtoString() {
        return Arrays.toString(arr) + " size: " + size;
    }

    public int[] getArray() {
        int[] tempArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i]=arr[i];
        }
        return tempArray;
    }

    public int getSize() {
        return size;
    }

    public double gameArrAvg() {
        double avg = 0;
        for (double val : arr) {
            avg += val / (size - 1);
        }
        return avg;
    }
    public String toString() {
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += ((i == 0) ? "" : " ") + arr[i];
        }
        res += "]";

        return res;
    }
}
