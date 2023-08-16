package lesson22.methodsOfArraysSorting;

public class ArrayBubbleSort1 {
    public static void bubbleSortApproaching(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            boolean isSorted = true;
            System.out.println("Run......");

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSorted = false;
                } else {
                    for (int k = arr.length - 1; k > j; k--) {
                        if (arr[k -1] > arr[k]) {
                            swap(arr, k, k - 1);
                        }
                    }
                }
            }
            if (isSorted) return;
        }
    }

    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
