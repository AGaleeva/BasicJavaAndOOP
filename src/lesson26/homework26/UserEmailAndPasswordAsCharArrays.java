package lesson26.homework26;

public class UserEmailAndPasswordAsCharArrays {
    private String email;
    private String password;

    public UserEmailAndPasswordAsCharArrays (String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email.trim().toLowerCase();
        if (emailIsValid(email)) {
            this.email = email;
        } else {
            System.out.println(email + " is not valid");
        }
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
        String[] arr = email.split("");
        boolean at = false;
        boolean dot = false;
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i].charAt(0);
            if (!(Character.isDigit(c) || Character.isAlphabetic(c) || c == '@' || c == '.' || c == '_' || c == '-'))
                return false;
            if (c == '@') {
                if (at) {
                    return false;
                }
                at = true;
            }
            if (c == '.') {
                if (!at) {
                    return false;
                }
                dot = true;
            }
        }
        if (!dot) {
            return false;
        }

        if (arr[arr.length - 1].charAt(0) == '.' || arr[arr.length - 2].charAt(0) == '.') {
            return false;
        }
        return true;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password){
        if (passwordIsValid(password)) {
            this.password = password;
        } else {
            System.out.println("The password " + password + " is not valid.");
        }
    }

    private boolean passwordIsValid (String password){
        String[] arrPswd = password.split("");
        if (arrPswd.length < 8) {
            return false;
        }
        boolean uppCase = false;
        boolean loweCase = false;
        boolean digit = false;
        boolean specSymbol = false;

        for (int i = 0; i < arrPswd.length; i++) {
            char c = arrPswd[i].charAt(0);
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
            if (uppCase && loweCase && digit && specSymbol) return true;
        }
        return false;
    }

    @Override
    public String toString () {
        return "User { " +
                "email = '" + email + '\'' +
                ", password = '" + password + '\'' + " " +
                '}';
    }
}
