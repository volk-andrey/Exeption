package org.example.service;

import org.example.exeption.WrongLoginException;
import org.example.exeption.WrongPasswordExeption;

public class ValidateService {
    private static final String VALID_SIMVOLS ="zxcvbnmasdfghjklqwertyuiopZXCVBNMASDFGHJJKLQWERTYUIOP1234567890_";
    public static void validate(String login, String password, String confirmPassword) {
        validateLogin(login);
        validatePassword(password, confirmPassword);
    }

    private static void validateLogin(String login) {
        if (login.length() > 20){
            throw new WrongLoginException("Логин должен быть не более 20 символов", login);
        }
        for (int i = 0; i < login.length(); i++) {
            if (!VALID_SIMVOLS.contains(String.valueOf((login.charAt(i))))) {
                throw new WrongLoginException("Логин содержит недопустимые символы", login);
            }
        }
    }

    private static void validatePassword(String password, String confirmPassword){
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordExeption("Пароли не совпадают");
        }
        if (password.length() > 20){
            throw new WrongPasswordExeption("Пароль должен быть не более 20 символов", password);
        }
        for (int i = 0; i < password.length(); i++) {
            if (!VALID_SIMVOLS.contains(String.valueOf((password.charAt(i))))) {
                throw new WrongPasswordExeption("Пароль содержит недопустимые символы", password);
            }
        }
    }
}
