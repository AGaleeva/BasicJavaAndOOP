package lesson26.homework26.test;

import lesson26.homework26.UserEmailAndPasswordAsCharArrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserEmailAndPasswordAsCharArraysTest {
    private UserEmailAndPasswordAsCharArrays user;
    private String email = "john@gmail.com";
    private String password = "Privat!1";

    @BeforeEach
    void setUp() {
        user = new UserEmailAndPasswordAsCharArrays(email, password);
    }

    @Test
    void setEmail() {
        String validEmail = "john@gmx.de";
        user.setEmail(validEmail);
        assertEquals(validEmail, user.getEmail());

        validEmail = " john@gmx.de ";
        user.setEmail(validEmail);
        assertEquals("john@gmx.de", user.getEmail());

        String invalidEmail = "john.gmx.de";
        user.setEmail(invalidEmail);
        assertEquals(validEmail.trim(), user.getEmail());

        invalidEmail = "jo@hn@gmx.de";
        user.setEmail(invalidEmail);
        assertEquals(validEmail.trim(), user.getEmail());

        invalidEmail = "john@gmxde";
        user.setEmail(invalidEmail);
        assertEquals(validEmail.trim(), user.getEmail());

        invalidEmail = "john@gmxde.";
        user.setEmail(invalidEmail);
        assertEquals(validEmail.trim(), user.getEmail());

        invalidEmail = "john@gmxd.e";
        user.setEmail(invalidEmail);
        assertEquals(validEmail.trim(), user.getEmail());

        invalidEmail = "jo!hn@gmxde";
        user.setEmail(invalidEmail);
        assertEquals(validEmail.trim(), user.getEmail());
    }

    @Test
    void setPassword() {
        String validPassword = "Privat!1";
        user.setPassword(validPassword);
        assertEquals(validPassword, user.getPassword());

        String invalidPassword = "Priva!1";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());

        invalidPassword = "privat!1";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());

        invalidPassword = "PRIVAT!1";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());

        invalidPassword = "Privat21";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());

        invalidPassword = "Privathf";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());

    }
}