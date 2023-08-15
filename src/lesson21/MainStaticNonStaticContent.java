package lesson21;

public class MainStaticNonStaticContent {

    int var1 = 10;
    public static void main(String[] args) {

//        var1 = 111;   // error!!! can't get not static variable from static method
//        temp():      //  error!!! can't get not static method from static method

        MainStaticNonStaticContent main = new MainStaticNonStaticContent();
        main.var1 = 111;
        main.temp();

    }
    public void temp() {
        System.out.println("Hello");
    }
}
