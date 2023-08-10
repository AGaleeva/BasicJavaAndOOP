package lesson17;

import java.util.Scanner;

public class CreateNewStudentFronScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Student student = getStudentFromScanner(scanner, "Please, enter your personal data.\n");
        System.out.println(student.toString());

        student.sayHello();

    }

    public static Student getStudentFromScanner(Scanner scanner, String msg){
        System.out.println(msg);
        Student student = new Student();
        System.out.println("Input first name:");
        student.firstName = scanner.nextLine();

        System.out.println("Input last name:");
        student.lastName = scanner.nextLine();
        student.birthday = getMyDateFromScanner(scanner, "Input date of birthday.");

        System.out.println("Input group:");
        student.group = scanner.nextLine();

        student.startCourse = getMyDateFromScanner(scanner, "Input date of curse start:");
        return student;
    }

    public static MyDate getMyDateFromScanner(Scanner scanner, String msg){
        System.out.println(msg);
        MyDate date = new MyDate();
        System.out.println("Input day:");
        date.day = scanner.nextInt();
        System.out.println("Input month:");
        date.month = scanner.nextInt();
        System.out.println("Input year:");
        date.year = scanner.nextInt();
        scanner.nextLine();
        return date;
    }
}
