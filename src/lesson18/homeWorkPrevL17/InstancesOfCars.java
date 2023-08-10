package homeWorkPrevFromLes17;

public class InstancesOfCars {

    /*
    #1
    Создать класс Car со следующими полями (String brand, String color, String licensePlate, MyDate registrationDate, Engine engine}
    Обратите внимание, поля registrationDate и engine - это тоже объект.
    Engine - содержмт информация о мощности двигателя и о типе (бензин, дизель, электро).

        Реализуйте метод toString в каждом классе.
        Реализуйте метод конструктор в каждом классе.
        Создайте два объекта автомобтля.

    #2
    В классе Engine добавте методы start и stop. Кадлый из них пусть выводит строку "Engine is started" "Engine is stoped".
    В классе Car добавте методы drive и stop. Первый должке заводить двигатель и писать, что такая то машина поехала.
    Второй, соответственно глушить двигатель и останавливать машину.

    #3 **
    Реализовать проверку, если машина уже едет, а я пытвюсь вызвать метод drive,
    должно появлятся сообщение, что машина уже едет.
    */

    public static void main(String[] args) {

        MyDate date1 = new MyDate(10, 4, 2017);
        Engine engine1 = new Engine(175, "benzine");
        Cars car1 = new Cars("Audi", "black", "AAA7788", date1, engine1);
        Cars car2 = new Cars("BMW", "white", "ABA7685", new MyDate(21, 8, 2022), new Engine(239, "diesel"));
        Cars carWithProblem = new Cars("WV", "grey", "BBB5544", new MyDate(11, 6, 2021), engine1);

        Cars[] cars = {car1, car2, carWithProblem};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
        System.out.println("=================== go ==================");
        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

        System.out.println();

        System.out.println("=================== test the second attempt to start ==================");
        cars[0].drive(); // это тоже самое, что car1.drive().
        car2.drive();

        System.out.println();

        System.out.println("=============================================");
        cars[0].stop();
        cars[0].ignition();
        cars[0].drive();

        System.out.println();

        System.out.println("==================== 2 test ========================");
        cars[0].stop();
        cars[0].ignition();
        System.out.println(cars[0].toString());


        System.out.println();

        System.out.println("=================== stop ==================");
        for (int i = 0; i < cars.length; i++) {
            cars[i].stop();
        }

        System.out.println();

//        =============================== Reference problem ========================================

        System.out.println("=============================== Reference problem ========================================");
        car1.stop();
        carWithProblem.stop();

        System.out.println(car1);  // можно не вызывать явно метод .toString(), система сама понимает и пытается его вызвать.
        System.out.println(carWithProblem);

        System.out.println();
        System.out.println("car1 should start engine.");
        car1.ignition();
        System.out.println();

        System.out.println(car1);
        System.out.println(carWithProblem); // хотя мы не заводили двигатель у этой машины, он будет тоже заведен,
                                            // поскольку двигатели использовались одинаковые (переменные с одинаковой ссылкой)

    }
}
