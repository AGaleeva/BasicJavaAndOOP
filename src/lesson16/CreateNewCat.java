package lesson16;


import static lesson16.MethodDateToString.dateToStringWithObject;

public class CreateNewCat {

    public static void main(String[] args) {

        MyDate date1 = new MyDate(); // create new object of MyDate class
        date1.day = 1;
        date1.month = 12;
        date1.year = 2022;

        Cat barsik = new Cat();
        barsik.name = "Barsik";
        barsik.birthday = date1;
        barsik.color = "black";
        barsik.isSterilized = false;

        printCat(barsik);
    }


    public static void printCat(Cat cat) {
        System.out.println("Cat " + cat.name + ", was born at " + dateToStringWithObject(cat.birthday) + ", color " + cat.color + ".");
    }
}
