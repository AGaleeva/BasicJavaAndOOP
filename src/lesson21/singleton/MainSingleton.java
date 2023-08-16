package lesson21.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance(); // здесь просто вернется тот же самый объект
        Singleton instance3 = Singleton.getInstance();

        instance1.temp = 1;
        instance2.temp = 2;
        instance3.temp = 3;

        instance1.print();
        instance2.print();
        instance3.print();

        System.out.println(Singleton.MESSAGE);

//        Singleton.MESSAGE = "ssdfsaf";  // поменять сообщение нельзя !!! поскольку это константа задана словом final

        Singleton2 instance4 = Singleton2.INSTANCE;
        Singleton2 instance5 = Singleton2.INSTANCE;
        instance4.print();
        instance5.print();
        System.out.println(Singleton2.MESSAGE);
    }
}
