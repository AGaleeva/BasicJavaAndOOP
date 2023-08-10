package practicum.constructor;

import practicum.constructor.MyDateConstructor;

public class Person {

    String firstName;
    String lastName;
    String phone;
    public MyDateConstructor birthday;

    public Person(String firstName, String lastName, String phone, MyDateConstructor birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.birthday = birthday;
    }

    public String toString() {
        return firstName + " " + lastName + " (" + birthday.toString() + ")" + " phone:" + phone;
    }
}
