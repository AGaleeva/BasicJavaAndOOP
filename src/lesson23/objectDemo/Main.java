package lesson23.objectDemo;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Jack", 21);
        Person p2 = new Person("Jack", 21);
        Person p3 = p2;

        System.out.println("p3 == p2 " + (p3 == p2)); // идет сравнение ссылок, поэтому true
        System.out.println("p1 == p2 " + (p1 == p2)); // идет сравнение ссылок, поэтому false
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


//        p3.setAge(20);
//        System.out.println(p2.getAge());

        System.out.println("p3 == p2 " + (p3.equals(p2))); // идет сравнение ссылок, поэтому true
        System.out.println("p1 == p2 " + (p1.equals(p2)));


    }
}
