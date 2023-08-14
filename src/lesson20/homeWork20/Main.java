package lesson20.homeWork20;

public class Main {

    public static void main(String[] args) {

        SmartArrayWithDelete array = new SmartArrayWithDelete();

        array.add(4);
        array.add(3);
        array.add(89);
        array.add(32);
        array.add(12);
        array.add(6);

        System.out.println(array);

        array.removeByElement(12);
        System.out.println(array);

        array.removeByIndex(1);
        System.out.println(array);

        array.removeByIndex(0);
        System.out.println(array);
    }
}
