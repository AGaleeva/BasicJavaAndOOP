package lesson26.homework26;

import lesson25.user.model.User;

public class MainUserEmailAndPswArr {
    public static void main(String[] args) {

        UserEmailAndPasswordAsCharArrays user = new UserEmailAndPasswordAsCharArrays("john@gmail.com", "1234");
        System.out.println(user);
        user.setEmail("john@gmxde"); // в данной ситуации мэйл написан с ошибкой, но здесь нет проверки
        System.out.println("============================================================");
        user.setPassword("Personal@2");
        System.out.println(user);
        System.out.println("============================================================");
        user.setEmail(" lljosm@hotmail.com");
        System.out.println(user);

    }
}
