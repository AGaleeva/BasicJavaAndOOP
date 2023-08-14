package lesson20.homeWorkPrevFromL19.InternetShop;

import lesson20.homeWorkPrevFromL19.InternetShop.Product;

public class Cart {

    private int size = 0;
    private Product[] arr = new Product[4];

    public void addProduct(Product element) {
        if (size >= arr.length) {
            increaseArray();
        }
        arr[size] = element;
        size++;
    }

    private void increaseArray() {
        Product[] tempArray = new Product[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }

    public Product[] getArray() {
        Product[] tempArray = new Product[size];
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
            res += arr[i] + ((i == size-1) ? "]" : "\n");
        }
//        res += "]";
        return res;
    }

    public void remove(int index) {
        if (index > 0 && index < size) {
            for (int i = index + 1; i < size; i++) {
                arr[i - 1] = arr[i];
            }
            size--;
        }
    }

    public void removeById(int id) {
        int index = getIndexById(id);
        remove(index);
    }

    public int getIndexById(int id) {
        int res = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i].getId() == id) {
                return i;
            }
        }
        return res;
    }

    public int prodQuantities() {
        return size;
    }

    public double sum() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i].getPrice();
        }
        return sum;
    }
}


