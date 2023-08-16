package lesson22.methodsOfArraysSorting;

import lesson22.methodsOfArraysSorting.ArrayBubbleSort;

public class Main {
    public static void main(String[] args) {

        int[] array = {-5, 6, 89, 23, 7, -94, 0, 70, 45, 3, -12};
        int[] array1 = {10, 0, -33, 56, 8, 4, 91, -6, 55, 32, 45};

//        ArraysSelectedSortMethod.selectedSort(array);

//        System.out.println(java.util.Arrays.toString(array));

//        ArrayBubbleSort.bubbleSort(array);

//        ArrayBubbleSort1.bubbleSortApproaching(array);
//        System.out.println(java.util.Arrays.toString(array));

//        ArrayBubbleSort.bubbleSort(array1);
//        System.out.println(java.util.Arrays.toString(array1));

        ArrayBubbleSort1.bubbleSortApproaching(array1);
        System.out.println(java.util.Arrays.toString(array1));



    }
}
