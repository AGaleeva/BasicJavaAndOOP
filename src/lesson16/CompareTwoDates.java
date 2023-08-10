package practicum;

public class CompareTwoDates {

     /*
    Написать метод, который принимает 6 целых чисел (day1, month1, year1, day2, month2, year2) и
    возвращает 1 если первая дата раньше второй, 0 если они равны, -1 если вторая дата раньше первой.
     */

    public static void main(String[] args) {

        System.out.println(dateCompare(1,1,2023, 1,1,2024)); // 1
        System.out.println(dateCompare(1,1,2023, 1,2,2023)); // 1
        System.out.println(dateCompare(1,1,2023, 10,11,2022)); // -1
        System.out.println(dateCompare(2,12,2023, 2,11,2023)); // -1

    }

    public static int dateCompare(int day1, int month1, int year1, int day2, int month2, int year2){
        if (year1<year2) {
            return 1;
        } else if (year2<year1){
            return  -1;
        } else {
            if (month1<month2){
                return 1;
            } else if (month2<month1){
                return -1;
            } else {
                if (day1<day2) {
                    return 1;
                } else if (day2<day1){
                    return -1;
                } else {
                    return 0;
                }
            }
        }

    }


    public static int dateCompare2(int day1, int month1, int year1, int day2, int month2, int year2){
        int date1= year1*10000 + month1*100 + day1;    //01.10.2020   == 2020*10000 + 1*100 + 1
        int date2= year2*10000 + month2*100 + day2;    //01.12.2021    == 2021*10000 + 12*100+1
        if (date1==date2) {
            return 0;
        }
        return (date1<date2)?1:-1;
    }
}
