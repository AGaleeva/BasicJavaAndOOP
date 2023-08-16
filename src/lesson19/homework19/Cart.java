package lesson19.homework19;

public class Cart {
    int index = 0;
    double totalPrice = 0;
    private String name;
    private Article[] arr = new Article[4];
    private int size = 0;

    public void addArticle(Article element) {
        if (size >= arr.length) {
            increaseArray();
        }
        arr[size] = element;
        size++;
    }

    private void increaseArray() {
        Article[] tempArray = new Article[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }

    public void removeArticle(Article element) {
        for (int i = 0; i < arr.length; i++) {
            if (element.equals(arr[i])) {
                index = i;
            }
        }
        for (int j = index + 1; j < size; j++) {
            arr[j - 1] = arr [j];
        }
        size--;
//        Article[] result = new Article[arr.length - 1];
//        for (int i = 0; i < index; i++) {
//            result[i] = arr[i];
//        }
//        for (int j = index + 1; j <= arr.length - 1; j++) {
//            result[j - 1] = arr[j];
//        }
//        size--;
//        for (int k = 0; k < size; k++) {
//            arr[k] = result[k];
//        }
    }

    public double countPrice() {
        for (int i = 0; i < size; i++) {
            totalPrice += arr[i].getPrice();
        }
        return totalPrice;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += arr[i] + "\n";
        }
        return res;
    }

    public String cartToPrint() {
        String res = "Your cart contains: \n";
        for (int i = 0; i < size; i++) {
            res += arr[i] + "\n";
        }
        return res;
    }

    public Article[] getArticleArr() {
        Article[] tempArray = new Article[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        return tempArray;
    }

}
