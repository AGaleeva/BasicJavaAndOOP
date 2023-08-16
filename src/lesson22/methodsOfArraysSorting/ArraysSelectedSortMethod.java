package lesson22.methodsOfArraysSorting;

public class ArraysSelectedSortMethod {

    public static int search(int[] array, int value) {  // линейный поиск элемента
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value) { // array must be SORTED out!!!
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (leftIndex <= rightIndex) {
//            int midIndex = (rightIndex + leftIndex) / 2;

            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            if (array[midIndex] == value) {
                return midIndex;
            }
            if (array[midIndex] < value) {
                leftIndex = midIndex + 1;
            } else {
                rightIndex = midIndex - 1;
            }
        }
        return -1;
    }

    public static void selectedSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = searchMin(arr, i, arr.length);
            if (arr[min] < arr[i]) {
                swap(arr, i, min);
            }
        }
    }

    public static int searchMin(int[] arr, int iMin, int iMax) {
        int indexOfMinEl = iMin;
        for (int i = iMin; i < iMax; i++) {
            if (arr[i] < arr[indexOfMinEl]) {
                indexOfMinEl = i;
            }
        }
        return indexOfMinEl;
    }

    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
