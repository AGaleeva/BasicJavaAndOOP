package lesson17.constructor;

public class Main {

    public static void main(String[] args) {

//            MyDateConstructor birthday = new MyDateConstructor(1,2,2000);
//            Person person1 = new Person("Jack", "Johnson","123-123-123", birthday);
//            Account account1 = new Account("DE1234567",5000000, person1);
//            System.out.println(account1);


        Person person1 = new Person("Jack", "Johnson", "123-123-123", new MyDateConstructor(1, 2, 2000));
        Account account1 = new Account("DE1234567", 5_000_000, person1);
        System.out.println(account1);


        System.out.println(account1.owner.toString());
        System.out.println(account1.owner.birthday.toString());
        MyDateConstructor birthday = account1.owner.birthday;
    }
}
