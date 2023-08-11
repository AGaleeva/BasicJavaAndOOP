package lesson19.demo;

public class MainDemo {

    public static void main(String[] args) {

        MyDateDemo myDate1 = new MyDateDemo(10, 1, 2023);

        System.out.println(myDate1);

        System.out.println("day: " + myDate1.getDay());
        System.out.println("month: " + myDate1.getMonth());
        System.out.println("year: " + myDate1.getYear());

        boolean format = false; // в реальной жизни это берется из каких-то других методов и настроек,
                                // например getFromPropertiesFile(), getFromScanner(), getFromFrontEnd()

        myDate1.setFormat(format);

        System.out.println(myDate1);

    }
}
