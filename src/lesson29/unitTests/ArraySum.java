package lesson29.unitTests;

public class ArraySum {
    public static void main(String[] args) {

        /*
        Задайте массив на 10 элементов и заполните его случайными числами в интервале от -10 до 10.
        Распечатайте полученный массив. Найдите сумму элементов массива c нечетными индексами.
        (int) (Math.random() * (b - a + 1) + a)
        Разработайте соответсвующий тест (набор тестов).
        */

        int[] array = new int[10];
        int a = -10;
        int b = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        printArray(array);

        int res = sumOfOddIndxEl(array);
        System.out.println("Sum of elements with odd indexes = " + res);
    }

    public static int sumOfOddIndxEl(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
