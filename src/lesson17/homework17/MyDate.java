package lesson17.homework17;

public class MyDate {

    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
        public String toString() {
        return ((day < 10) ? "0" : "") + day + "." + month + "." + year;
    }
}
