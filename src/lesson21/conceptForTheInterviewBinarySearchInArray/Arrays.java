package lesson21.conceptForTheInterviewBinarySearchInArray;

public class Arrays {

    public static int search(int[] array, int value) {  // линейный поиск элемента
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value) { // array is the SORTED array!!!
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
}
