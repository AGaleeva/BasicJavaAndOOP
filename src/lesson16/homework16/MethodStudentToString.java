package lesson16.homework16;

import lesson16.MyDate;

import static lesson16.MethodDateToString.dateToStringWithObject;

public class MethodStudentToString {

    public static void main(String[] args) {

        MyDate birthdate1 = new MyDate();
        MyDate dateStartCourse = new MyDate();

        birthdate1.day = 1;
        birthdate1.month = 12;
        birthdate1.year = 1992;

        dateStartCourse.day = 7;
        dateStartCourse.month = 7;
        dateStartCourse.year = 2023;

        Student student1 = new Student();
        student1.firstName = "Alice";
        student1.lastName = "Grace";
        student1.birthday = birthdate1;
        student1.group = "First Group";
        student1.startCourse = dateStartCourse;

        System.out.println(studentToString(student1));
    }

    public static String studentToString(Student student) {

        return student.firstName + " " + student.lastName + ", " + dateToStringWithObject(student.birthday) + ". \n"
                + student.group + ", course started at " + dateToStringWithObject(student.startCourse) + ".";
    }
}
