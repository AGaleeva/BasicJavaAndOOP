package lesson22.methodsOfArraysSorting;

import lesson22.methodsOfArraysSorting.ArrayBubbleSort;

public class Main {
    public static void main(String[] args) {

        int[] array = {-5, 6, 89, 23, 7, -94, 0, 70, 45, 3, -12};

//        ArraysSelectedSortMethod.selectedSort(array);

//        System.out.println(java.util.Arrays.toString(array));

        ArrayBubbleSort.bubbleSort(array);

        System.out.printf(java.util.Arrays.toString(array));

    }
}
