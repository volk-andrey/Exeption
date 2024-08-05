package org.example.exeption;

public class WrongPasswordExeption extends RuntimeException{
    private String message;
    private String password;
    private String confirmPassword;
    public WrongPasswordExeption() {
        super("Wrong Password");
    }

    public WrongPasswordExeption(String message) {
        super(message);
    }

    public WrongPasswordExeption(String message, String password) {
        super(message);
        this.password = password;
    }

    public WrongPasswordExeption(String message, String password, String confirmPassword) {
        super(message);
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

}
