package lesson25;

import lesson25.user.model.User;

public class UserApplMain {

    public static void main(String[] args) {

        User user = new User("john@gmail.com", "1234");
        System.out.println(user);
        user.setEmail("john.gmx.de"); // в данной ситуации мэйл написан с ошибкой, но здесь нет проверки
        System.out.println("============================================================");
        user.setPassword("Personal@2");
        System.out.println(user);
        System.out.println("============================================================");
        user.setEmail(" lljosm@hotmail.com");
        System.out.println(user);

        user.setEmail("           ");
        System.out.println(user);

    }
}
