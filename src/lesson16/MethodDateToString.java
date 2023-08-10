package lesson16;

public class MethodDateToString {

    /*
    Написать метод, который принимает на вход 3 числа и выводит дату в формате "08. August 2023".
    */
    public static void main(String[] args) {

        int day = 8;
        int month = 8;
        int year = 2023;

        System.out.println(dateToString(day, month, year));

        MyDate date1 = new MyDate(); // create new object of MyDate class
        date1.day = 1;
        date1.month = 12;
        date1.year = 2023;

        MyDate date2 = new MyDate(); // create new object of MyDate class (date2)
        date2.day = 3;
        date2.month = 4;
        date2.year = 2022;


        System.out.println(dateToStringWithObject(date1));
        System.out.println();
        System.out.println(dateToStringWithObject(date2));
    }

    public static String dateToString(int day, int month, int year) {

        if (month < 0 || month > 12) {
            return "error";
        }

        String[] months = {" January ", " Februar ", " March ", " April ", " May ", " June ", " July ", " August ", " September ", " October ", " November ", " December "};

        return (day < 10 ? "0" : "") + day + "." + months[month - 1] + year;

    }

    public static String dateToStringWithObject(MyDate date) {

        if (date.month < 0 || date.month > 12) {
            return "error";
        }

        String[] months = {" January ", " Februar ", " March ", " April ", " May ", " June ", " July ", " August ", " September ", " October ", " November ", " December "};
        return (date.day < 10 ? "0" : "") + date.day + "." + months[date.month - 1] + date.year;
    }
}
