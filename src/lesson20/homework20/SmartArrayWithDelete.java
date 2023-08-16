package lesson20.homework20;

public class SmartArrayWithDelete {

    private int size = 0;
    private int[] arr = new int[4];
    private int index = 0;

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
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }

    private int getIndex(int element) {
        int res = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return res;
    }

    public void removeByIndex(int index) {
        if (index >= 0 && index < size) {
            for (int i = index + 1; i < size; i++) {
                arr[i - 1] = arr[i];
            }
            size--;
        }
    }
    public void removeByElement(int element) {
        index = getIndex(element);
        removeByIndex(index);
    }

    public int[] getArray() {
        int[] tempArray = new int[size];
        for (int i = 0; i < size; i++) {
            tempArray[i] = arr[i];
        }
        return tempArray;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += ((i == 0) ? "" : ", ") + arr[i];
        }
        res += "]";

        return res;
    }
}
