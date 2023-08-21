package lesson25.user.model;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);                        // вставляем проверку уже в конструктор через сеттер (в котором проверка написана)
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (emailIsValid(email)) {
            this.email = email;
        } else {
            System.out.println(email + " is not valid");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (passwordIsValid(password)) {
            this.password = password;
        } else {
            System.out.println("The password " + password + " is not valid.");
        }
    }

    private boolean passwordIsValid(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean uppCase = false;
        boolean loweCase = false;
        boolean digit = false;
        boolean specSymbol = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                uppCase = true;
            }
            if (Character.isLowerCase(c)) {
                loweCase = true;
            }
            if (Character.isDigit(c)) {
                digit = true;
            }
            if (c == '!' || c == '%' || c == '@' || c == '*' || c == '&') {
                specSymbol = true;
            }
            if(uppCase && loweCase && digit && specSymbol) return true;
        }
        return false;
    }

    /*
    TODO Homework
    1) Min 8 symbols
    2) Min 1 capital letter symbol
    3) Min 1 small letter symbol
    4) Min 1 digit
    6) Min 1 special symbol (! % @ * &)
    */

    /*
    1) '@' - exists and only one
    2) '.' - min one dot after '@'
    3) min two symbols after last dot
    4) alphabetic, digits, '@', '.', '_', '-'
    */
    private boolean emailIsValid(String email) {
        int at = email.indexOf('@');
        if (at == -1 || (email.indexOf('@', at + 1) >= 0)) {
            return false;
        }
//        if (email.lastIndexOf('@') != at) { //  это такой же метод, как и выше, но с методом lastIndexOf
        // если один индекс не равен другому индексу:
        // у нас минимум два символа '@', т.е. мэйл не валиден
//            return false;
//        }
        if (email.indexOf('.', at + 1) == -1) return false;

        if (email.lastIndexOf('.') >= email.length() - 2) return false;
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
//            if (c >= '0' && c <= '9') return false; // проверяем, не цифра ли это по таблице ASCII
            if (!(Character.isDigit(c) || Character.isAlphabetic(c) || c == '@' || c == '.' || c == '_' || c == '-'))
                return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "User { " +
                "email = '" + email + '\'' +
                ", password = '" + password + '\'' + " " +
                '}';
    }
}
