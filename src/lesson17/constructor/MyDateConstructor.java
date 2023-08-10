package practicum.constructor;

public class MyDateConstructor {

    int day;
    int month;
    int year;

    public MyDateConstructor(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "-" + month + "-" + year;
    }

}
