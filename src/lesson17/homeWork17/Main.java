package lesson17.homeWork17;

public class Main {
    public static void main(String[] args) {

        Engine renaultMotor = new Engine("petrol", 147);
        MyDate registrDateRen = new MyDate(3, 2, 2019);

        Car renault = new Car("Renault Koleos", "deep blue", "BDV 3487", registrDateRen, renaultMotor);

        System.out.println(renault.toString());
        renault.drive();
        renault.drive();
        renault.stop();


        System.out.println();
        System.out.println("**************************************************");
        Engine miniMotor = new Engine("electro", 135);
        MyDate registrDateMini = new MyDate(1, 4, 2020);

        Car miniCooper = new Car("Mini Cooper SE", "metallic", "BCA 1212", registrDateMini, miniMotor);

        System.out.println(miniCooper.toString());
        miniCooper.drive();
        miniCooper.stop();


    }
}
