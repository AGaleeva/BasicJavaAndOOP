package practicum;

public class MainPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Jack", 20);
        Person p2 = new Person("Ann", 21);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("The age of the first person is " + p1.getAge());


    }
}
