package lesson19.demo;

public class MyDateDemo {
    private int day;
    private int month;
    private int year;
    private boolean format = true;

    public MyDateDemo(int day, int month, int year) {
//        if (!isArgsCorrect(day, month, year)) throw new Exception();
        this.day = day;
        this.month = month;
        getDefYear(year); // можно вводить через отдельно объявленный метод
    }

    private void getDefYear(int year) {
        this.year = (year >= 2000) ? year : 2000;
    }

    private boolean isArgsCorrect(int day, int month, int year) {
//        TODO implements cheking parametrs
        return true;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setFormat(boolean format) {
        this.format = format;
    }

    public String toString() {
        if (!format) {
            return year + "." + month + "." + day;
        } else {
            return day + "." + month + "." + year;
        }
    }
}
