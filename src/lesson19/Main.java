package lesson19;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Iosif");
//        System.out.println(student1);
        student1.addRates(5);
        student1.addRates(4);
        student1.addRates(3);
        System.out.println(student1);

        Student student2 = new Student("Boris");

        student2.addRates(2);
        student2.addRates(5);
        student2.addRates(3);
        System.out.println(student2);

        Student student3 = new Student("Basil");

        student3.addRates(4);
        student3.addRates(4);
        student3.addRates(5);
        System.out.println(student3);

        Student student4 = new Student("Dmitry");

        student4.addRates(5);
        student4.addRates(4);
        student4.addRates(4);
        System.out.println(student4);

        Student student5 = new Student("Igor");

        student5.addRates(3);
        student5.addRates(4);
        student5.addRates(4);
        System.out.println(student5);

        Student student6 = new Student("Alex");

        student6.addRates(3);
        student6.addRates(4);
        student6.addRates(2);
        System.out.println(student6 + "\n");

        System.out.println("===========================================\n");

        Group gr1 = new Group("group 1");
//        System.out.println(gr1);

        gr1.addStudent(student1);
        gr1.addStudent(student2);
        gr1.addStudent(student3);
        gr1.addStudent(student4);
        gr1.addStudent(student5);
        gr1.addStudent(student6);

        System.out.println(gr1);

        System.out.println();

       /*
        SmartArray array = new SmartArray();

        System.out.println(array);

        array.add(1);
        System.out.println(array);

        array.add(2);
        System.out.println(array);

        array.add(30);
        System.out.println(array);

        array.add(23);
        System.out.println(array);

        array.add(36);
        System.out.println(array);

        array.add(43);
        System.out.println(array);

        array.add(32);
        System.out.println(array);

        array.add(67);
        System.out.println(array);

        array.add(89);
        System.out.println(array);

        array.add(98);
        System.out.println(array);
*/
    }

}
