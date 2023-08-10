package practicum;

public class Main {

    public static void main(String[] args) {

        MyDate date1 = new MyDate(10, 4, 2017);
        Engine engine1 = new Engine(175, "benzine");
        Car car1 = new Car("Audi", "black", "AAA7788", date1, engine1);
        Car car2 = new Car("BMW", "white", "ABA7685", new MyDate(21, 8, 2022), new Engine(239, "diesel"));
        Car carWithProblem = new Car("WV", "grey", "BBB5544", new MyDate(11, 6, 2021), engine1);

        Car[] cars = {car1, car2, carWithProblem};
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


        System.out.println("============================ private demo ===================================");

        Car car4 = new Car("Opel", "blue", "11111111", new MyDate(10, 10, 2010), new Engine(150, "electro"));
        // car4.isDriving = true; // the variable "isDriving" is private ==> isn't possible to change it from outside

        System.out.println(car4);

    }

}
