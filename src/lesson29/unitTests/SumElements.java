package lesson29.unitTests;

public class SumElements {
    public static void main(String[] args) {
        /*
        Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
        Найдите среднюю величину по всем четным элементам массива.
        Разработайте соответсвующий тест (набор тестов).
        */

        int[] array = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
        System.out.println(avgOfEvenElements(array));
    }
    public static double avgOfEvenElements(int[] arr) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                sum += arr[i];
            }
        }
        return (double) sum / count;
    }

}
