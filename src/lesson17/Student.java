package lesson17;

public class Student {

    String firstName;
    String lastName;
    MyDate birthday;
    String group;
    MyDate startCourse;


    public String toString() {
        return firstName + " " + lastName + ", " + birthday.toString() + ". The group: " + group + ", course start at " + startCourse.toString() + ".";
    }

    public void sayHello() {
        System.out.println("hello, I'm a student  " + firstName + " " + lastName + ".");
    }
}
